package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.roku.cloudgo.lib.ProductClass;
import com.roku.cloudgo.pojo.Product;
import com.roku.cloudgo.service.ProductServiceImpl;
import com.roku.cloudgo.service.SellerServiceImpl;
import com.roku.cloudgo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;


@Controller
public class ProductControllerImpl implements ProductController {
    @Autowired
    private ProductServiceImpl productService;
    @Autowired
    private SellerServiceImpl sellerService;
    @Autowired
    private SessionService sessionService;

    @Override
    @RequestMapping("/addProduct")
    public boolean addProduct(HttpServletRequest request, String productName, Float productPrice, Long productRemaining, String mainClass, String subClass, String productDescription, Long productImage, MultipartFile image) {
        boolean flag = false;
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            Product product = new Product();
            String subClassId = String.valueOf(ProductClass.valueOf(subClass).getIndex());
            Long id = Long.parseLong("0");
            Random r = new Random();
            do {
                id = r.nextLong() * (1000000000);
                id = Long.parseLong(subClassId+id.toString());
            }while(productService.getByProductID(id)!=null);
            Long productId = id;
            product.setProductId(productId);
            product.setProductName(productName);
            product.setProductPrice(productPrice);
            product.setProductRemaining(productRemaining);
            product.setProductImage(productImage);
            product.setProductDescription(productDescription);
            product.setSellerId(sellerService.getSeller((String) sessionService.getAttr(request.getSession(), "sellerName")).getSellerId());
            boolean addFlag = productService.addProduct(product);
            if(addFlag)
            {
                flag = true;
                productService.saveImage(image, productImage);
            }
        }
        return flag;
    }


    @Override
    @RequestMapping("/toShowProductInfo")
    public JSONObject showProductInfo(Long productId) {
        return productService.product2JsonObject(productService.getByProductID(productId));
    }

    @Override
    @RequestMapping("/toChangeProduct")
    @ResponseBody
    public boolean progressChange(HttpServletRequest request, Long productId, Float productPrice, Long productRemaining, String productDescription, Long productImage) {
        boolean flag = false;
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            if(productService.getByProductID(productId).getSellerId() == sellerService.getSeller((String)sessionService.getAttr(request.getSession(), "sellerName")).getSellerId())
            {
                Product product = new Product();
                product.setProductId(productId);
                product.setProductPrice(productPrice);
                product.setProductRemaining(productRemaining);
                product.setProductDescription(productDescription);
                product.setProductImage(productImage);
                flag = productService.editProduct(product);
            }
        }
        return flag;
    }

    @Override
    @RequestMapping("/findProductData")
    @ResponseJSONP
    public JSONObject getProducts(Integer number) {
        return productService.findProducts(number);
    }


    @RequestMapping("/testUpload")
    public String upload(MultipartFile image)
    {
        productService.saveImage(image, Long.parseLong("666666"));
        return "index";
    }
}
