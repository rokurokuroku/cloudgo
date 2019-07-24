package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface UserController {

    @RequestMapping("/toLogin")
    String processLogin(String userName,String userPassword);
    //登录成功返回"index.jsp"，失败返回"toLogin"

    @RequestMapping("/toRegister")
    String processRegister(String userName, String userEmail, long userTelephone, String userPassword, String reUserPassword, int paymentCode, int rePaymentCode);
    /*数据库Users表生成一个新的对象
    自动生成user_id、user_level
    注册成功返回"toLogin"，失败返回"toRegister"
    确认两次输入的密码相同*/

    @RequestMapping("/toChange")
    String processChange(long userID, String userEmail, long userTelephone, char userGender, String address, String descriptions);
    /*修改用户信息
     成功返回"user.jsp"，失败返回"user.jsp"*/
}
