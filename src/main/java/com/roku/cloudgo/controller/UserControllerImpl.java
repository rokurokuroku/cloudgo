package com.roku.cloudgo.controller;

import com.roku.cloudgo.pojo.User;
import com.roku.cloudgo.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserControllerImpl implements UserController {
    @Resource
    private UserServiceImpl userService;



    @Override
    @RequestMapping("/toLogin")
    public String processLogin(String userName, String userPassword) {
        boolean flag = false;

        // 判断是否为空
        if(userName.equals("") || userPassword.equals(""))
        {
            flag = false;
        }
        else {
            // 检查账号密码是否匹配
            flag = userService.checkPassword(userName, userPassword);
        }

        if(flag)
        {
            return "redirect:/index";
        }
        else
        {
            return "redirect:/login";
        }
    }

    @Override
    @RequestMapping("/toRegister")
    public String processRegister(String userName, String userEmail, long userTelephone, String userPassword, String reUserPassword, int paymentCode, int rePaymentCode) {
        boolean flag = false;

        // 检查两次输入密码是否匹配
        if(userPassword.equals(reUserPassword) && paymentCode == rePaymentCode)
        {
            // 添加数据
            boolean register = false;
            User user = new User();
            user.setUserName(userName);
            user.setUserEmail(userEmail);
            user.setUserTelephone(userTelephone);
            user.setUserPassword(userPassword);

            register = userService.userRegister(user, paymentCode);

            if(register)
            {
                flag = true;
            }

        }
        else
        {
            flag = false;
        }

        if(flag)
        {
            return "redirect:/login";
        }
        else
        {
            return "redirect:/login";
        }
    }

    @Override
    @RequestMapping("/toChange")
    public String processChange(long userID, String userEmail, long userTelephone, String userGender, String address, String descriptions) {
        boolean flag = false;

        User user = new User();
        user.setUserId(userID);
        user.setUserEmail(userEmail);
        user.setUserTelephone(userTelephone);
        user.setUserGender(userGender);
        user.setShippingAddress(address);
        user.setUserDescription(descriptions);

        flag = userService.editUser(user);

        if(flag)
        {
            return "user";
        }
        else
        {
            return "user";
        }
    }
}
