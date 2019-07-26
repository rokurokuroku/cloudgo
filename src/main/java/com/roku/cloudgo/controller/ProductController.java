package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

public interface ProductController {
    @RequestMapping("/addProduct")
    String addProduct(Long sellerId, String productName, Float productPrice, Long productRemaining, Integer class1, Integer class2, String productDescription, Long productImage);
    /*
    创建一个新的商品
    根据选择的分类class1,class2生成ID
    图片对应的是保存在本地的ID，商家上传图片到本地
    */

    @RequestMapping("/toShowProduct")
    JSONObject showProduct(Long productId);
    /*
    商品首页/搜索结果页面，显示商品的简略信息
    返回商品的信息：图片、名字、价格
     */

    @RequestMapping("/toShowProductInfo")
    JSONObject showProductInfo(Long productId);
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
