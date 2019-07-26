package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.roku.cloudgo.pojo.Product;
import com.roku.cloudgo.service.ProductServiceImpl;
import com.roku.cloudgo.service.SellerServiceImpl;
import com.roku.cloudgo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


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
    public boolean addProduct(HttpServletRequest request, String productName, Float productPrice, Long productRemaining, Integer class1, Integer class2, String productDescription, Long productImage) {
        boolean flag = false;
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            Product product = new Product();
            Long productId = Long.parseLong("");
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
    public String progressChange(Float productPrice, Long productRemaining, String productDescription, Long productImage) {
        return null;
    }

    @Override
    @RequestMapping("/findProductData")
    @ResponseJSONP
    public JSONObject getProducts(Integer number) {
        return productService.findProducts(number);
    }
}
