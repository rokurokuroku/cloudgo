package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.roku.cloudgo.pojo.User;
import com.roku.cloudgo.service.BankService;
import com.roku.cloudgo.service.SessionService;
import com.roku.cloudgo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserControllerImpl implements UserController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private SessionService sessionService;

    @Autowired
    private BankService bankService;


    @Override
    @RequestMapping("/toLogin")
    public String processLogin(HttpServletRequest request, String userName, String userPassword) {
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
            sessionService.setLoginUser(request.getSession(), userName);
            return "redirect:/index";
        }
        else
        {
            return "redirect:/login";
        }
    }

    @Override
    @RequestMapping("/toRegister")
    public String processRegister(String userName, String userEmail, Long userTelephone, String userPassword, String reUserPassword, String paymentCode, String rePaymentCode) {
        boolean flag = false;

        // 检查两次输入密码是否匹配
        if(userPassword.equals(reUserPassword) && paymentCode.equals(rePaymentCode))
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
    public String processChange(HttpServletRequest request, String userEmail, Long userTelephone, String userGender, String address, String descriptions) {
        boolean flag = false;
        if(sessionService.checkUserLogin(request.getSession())) {
            User user = new User();
            user.setUserName((String)sessionService.getAttr(request.getSession(), "userName"));
            user.setUserEmail(userEmail);
            user.setUserTelephone(userTelephone);
            user.setUserGender(userGender);
            user.setShippingAddress(address);
            user.setUserDescription(descriptions);

            flag = userService.editUser(user);
        }
        else
        {
            flag = false;
        }

        if(flag)
        {
            return "redirect:/user";
        }
        else
        {
            return "redirect:/user";
        }
    }

    @Override
    @RequestMapping("/checkUserName")
    @ResponseJSONP
    public JSONObject checkUserName(String userName) {
        boolean result = userService.checkUserName(userName);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("valid", result);
        return jsonObject;
    }


    @Override
    @RequestMapping("/toLogout")
    public String processLogout(HttpServletRequest request) {
        sessionService.logout(request.getSession());
        return "redirect:/login";
    }

    @Override
    @RequestMapping("/toShowUserInfo")
    @ResponseJSONP
    public JSONObject showUserInfo(HttpServletRequest request) {
        if(sessionService.checkUserLogin(request.getSession()))
        {
            User user = userService.getUser((String)sessionService.getAttr(request.getSession(), "userName"));
            JSONObject jsonObject =  (JSONObject) JSONObject.toJSON(user);
            jsonObject.put("userBalance", bankService.getBankRecord(user.getUserId()).getUserBalance());
            jsonObject.put("userScore", bankService.getBankRecord(user.getUserId()).getUserScore());
            return jsonObject;
        }
        else
        {
            return null;
        }
    }
}
