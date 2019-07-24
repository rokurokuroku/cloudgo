package com.roku.cloudgo.controller;

import com.roku.cloudgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public interface UserController {

    @RequestMapping("/toLogin")
    String processLogin(String userName,String passWord);//登录成功返回"index"，失败返回"login"

    @RequestMapping("/toRegister")
    String processRegister(String userName,String userEmail,long userPhone,String passWord,String payPwd);//注册成功返回"login"，失败返回"register"


}
