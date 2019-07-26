package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public interface UserController {



    @RequestMapping("/toLogin")
    String processLogin(HttpServletRequest request, String userName, String userPassword);
    //登录成功返回"index.jsp"，失败返回"/login"

    @RequestMapping("/toRegister")
    String processRegister(String userName, String userEmail, Long userTelephone, String userPassword, String reUserPassword, Integer paymentCode, Integer rePaymentCode);
    /*数据库Users表生成一个新的对象
    自动生成user_id、user_level
    之后返回注册登录页面
    确认两次输入的密码相同*/

    @RequestMapping("/toChange")
    String processChange(Long userID, String userEmail, Long userTelephone, String userGender, String address, String descriptions);
    /*修改用户信息
     成功返回"user.jsp"，失败返回"user.jsp"*/

    @RequestMapping("/toShowUserInfo")
    JSONObject showUserInfo(Long userID);
    /*返回用户信息：用户名、等级、余额、积分、电话、邮箱、性别、地址、个人描述*/

    @RequestMapping("/toLogout")
    String processLogout(HttpServletRequest request);
}
