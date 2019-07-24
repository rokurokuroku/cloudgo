package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface UserController {

    @RequestMapping("/toLogin")
    String processLogin(String userName,String passWord);
    //登录成功返回"index"，失败返回"toLogin"

    @RequestMapping("/toRegister")
    String processRegister(String userName,String userEmail,long userPhone,String passWord,String rePassWord,String payPwd,String rePayPwd);
    //注册成功返回"toLogin"，失败返回"toRegister"
    //确认两次输入的密码相同

    @RequestMapping("/toChange")
    String processChange(String userName,String userEmail,long userPhone,char userGender,String address,String descriptions);
    //修改用户信息 成功返回"user"，失败返回"user"
}
