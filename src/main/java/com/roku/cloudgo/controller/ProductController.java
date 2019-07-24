package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface ProductController {
    @RequestMapping("/toSell")
    String progressSell(long sellerId, long productId, float productPrice, int productRemaining);
    /*
    创建一个新的商品
    */

    @RequestMapping("/toChangeProduct")
    String progressChange(float productPrice, int productRemaining, String productDescription, long productImage);
   /*
   修改商品的信息
   */

}
