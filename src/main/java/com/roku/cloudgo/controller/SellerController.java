package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public interface SellerController {

    @RequestMapping("/toSellerLogin")
    String processLogin(HttpServletRequest request, String sellerName, String sellerPassword);
    //登录成功返回"index.jsp"，失败返回"/login"

    @RequestMapping("/toSellerRegister")
    String processRegister(String sellerName, String sellerEmail, Long sellerTelephone, String sellerPassword, String reSellerPassword);
    /*
    数据库Sellers表生成一个新的对象
    自动生成seller_id、seller_level
    返回之前的注册界面
    确认两次输入的密码相同
    */

    @RequestMapping("/toSellerChange")
    String processChange(HttpServletRequest request, String sellerEmail, Long sellerTelephone, Character sellerGender, String descriptions);
    /*
    修改用户信息
    成功返回"seller.jsp"，失败返回"seller.jsp"
    */

    @RequestMapping("/toShowSellerInfo")
    JSONObject showSellerInfo(HttpServletRequest request);
    /*返回商家信息：用户名、等级、电话、邮箱、性别、地址、商家描述*/

    @RequestMapping("/toSellerLogout")
    String processLogout(HttpServletRequest request);

    @RequestMapping("/checkSellerName")
    JSONObject checkSellerName(String sellerName);
}
