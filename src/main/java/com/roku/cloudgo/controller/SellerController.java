package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface SellerController {
    @RequestMapping("/toSellerLogin")
    String processLogin(String sellerName, String sellerPassword);
    //登录成功返回"index.jsp"，失败返回"toSellerLogin"

    @RequestMapping("/toSellerRegister")
    String processRegister(String sellerName, String sellerEmail, long sellerTelephone, String sellerPassword, String reSellerPassword);
    /*
    数据库Sellers表生成一个新的对象
    自动生成seller_id、seller_level
    注册成功返回"toSellerLogin"，失败返回"toSellerRegister"
    确认两次输入的密码相同
    */

    @RequestMapping("/toSellerChange")
    String processChange(long userID, String userEmail, long userTelephone, char userGender, String address, String descriptions);
    /*
    修改用户信息
    成功返回"seller.jsp"，失败返回"seller.jsp"
    */
}
