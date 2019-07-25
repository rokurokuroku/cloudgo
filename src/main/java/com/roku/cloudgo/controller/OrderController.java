package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.pojo.Order;
import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderController {

    @RequestMapping("/toBuy")
    String progressBuy(Long buyerId, Long sellerId, Long productId, String address, Integer productRemaining, Integer buyNumber);
    /*
    检测存货是否充足：检测productRemaining（存货）是否大于buyNumber（订单的购买数量）
    检测地址是否有效（不为空）
    根据productId x productPrice生成订单交易额transactionAmount
    返回
    */

    @RequestMapping("/toChangeOrder")
    String progressChange(Long orderId, Integer productNumber, Integer buyNumber);
    /*修改订单信息*/


    @RequestMapping("/findOrders")
    Order getOrders(Long buyerId);
    /*读取用户的所有订单数据并返回*/
}
