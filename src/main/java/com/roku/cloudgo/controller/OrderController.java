package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderController {

    @RequestMapping("/toBuy")
    String progressBuy(long buyerId, long sellerId, long productId, String address, int productRemaining, int buyNumber);
    /*
    检测存货是否充足：检测productRemaining（存货）是否大于buyNumber（订单的购买数量）
    根据productId x productPrice生成订单交易额transactionAmount
    */

    @RequestMapping("/toChangeOrder")
    String progressChange(long orderId, int productNumber, int buyNumber);

}
