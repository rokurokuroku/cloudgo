package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderController {

    @RequestMapping("/toBuy")
    String progressBuy(long buyerId,long sellerId,long productId,String address,int productNumber,int buyNumber);
    //检测productNumber存货是否大于buyNumber（存货充足）
    //根据productId x productPrice生成订单交易额transactionAmount

    @RequestMapping("/toChangeOrder")
    String progressChange(long orderId,int productNumber,int buyNumber);

}
