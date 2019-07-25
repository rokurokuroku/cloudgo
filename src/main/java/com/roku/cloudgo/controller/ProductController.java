package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

public interface ProductController {
    @RequestMapping("/toSell")
    String progressSell(Long sellerId, Long productId, Float productPrice, Long productRemaining);
    /*
    创建一个新的商品
    */

    @RequestMapping("/toShowProduct")
    String showProduct(Long productId);
    /*
    商品首页/搜索结果页面，显示商品的简略信息
    返回商品的信息：图片、名字、价格
     */

    @RequestMapping("/toShowProductInfo")
    String showProductInfo(Long productId);
    /*
    商品详情界面
    返回商品的信息：图片、名字、价格、卖家姓名、商品详情、商品剩余量、销量、评分
     */

    @RequestMapping("/toChangeProduct")
    String progressChange(Float productPrice, Long productRemaining, String productDescription, Long productImage);
   /*
   修改商品的信息
   */

    @RequestMapping("/findProductData")
    JSONObject getProducts(Integer data);
}
