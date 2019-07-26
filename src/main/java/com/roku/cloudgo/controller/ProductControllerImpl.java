package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.roku.cloudgo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductControllerImpl implements ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @Override
    @RequestMapping("/addProduct")
    public String addProduct(Long sellerId, String productName, Float productPrice, Long productRemaining, Integer class1, Integer class2, String productDescription, Long productImage) {
        return null;
    }

    @Override
    @RequestMapping("/toShowProduct")
    public JSONObject showProduct(Long productId) {
        return null;
    }

    @Override
    @RequestMapping("/toShowProductInfo")
    public JSONObject showProductInfo(Long productId) {
        return null;
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
