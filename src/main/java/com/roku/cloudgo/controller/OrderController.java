package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public interface OrderController {

    @RequestMapping("/toBuy")
    boolean progressBuy(HttpServletRequest request, Long productId, String address, Long buyNumber, String paymentCode);
    /*
    购买商品
    检测存货是否充足：检测productRemaining（存货）是否大于buyNumber（订单的购买数量）
    检测地址是否有效（不为空）
    根据productId x productPrice生成订单交易额transactionAmount
    返回true购买成功
    */

//    @RequestMapping("/toChangeOrder")
//    boolean progressChange(HttpServletRequest request, Long orderId, Integer productNumber, Integer buyNumber);
//    /*修改订单信息*/


    @RequestMapping("/showOrders")
    @ResponseJSONP
    JSONObject showOrders(HttpServletRequest request);
    /*读取用户的所有订单数据并返回*/

    @RequestMapping("/showSellerOrders")
    @ResponseJSONP
    JSONObject showSellerOrders(HttpServletRequest request);
}
