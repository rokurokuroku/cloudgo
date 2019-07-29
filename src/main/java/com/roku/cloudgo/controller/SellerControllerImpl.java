package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.roku.cloudgo.pojo.Seller;
import com.roku.cloudgo.service.SellerService;
import com.roku.cloudgo.service.SellerServiceImpl;
import com.roku.cloudgo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SellerControllerImpl implements SellerController {
    @Autowired
    private SessionService sessionService;
    @Autowired
    private SellerServiceImpl sellerService;

    @Override
    @RequestMapping("/toSellerLogin")
    public String processLogin(HttpServletRequest request, String sellerName, String sellerPassword) {
        boolean flag = false;

        // 判断是否为空
        if(sellerName.equals("") || sellerPassword.equals(""))
        {
            flag = false;
        }
        else {
            // 检查账号密码是否匹配
            flag = sellerService.checkPassword(sellerName, sellerPassword);
        }

        if(flag)
        {
            sessionService.setLoginSeller(request.getSession(), sellerName);
            return "redirect:/sellerIndex";
        }
        else
        {
            return "redirect:/sellerLogin";
        }
    }

    @Override
    @RequestMapping("/toSellerRegister")
    public String processRegister(String sellerName, String sellerEmail, Long sellerTelephone, String sellerPassword, String reSellerPassword) {
        boolean flag = false;
        // 检查两次输入密码是否匹配
        if(sellerPassword.equals(reSellerPassword))
        {
            // 添加数据
            boolean register = false;
            Seller seller = new Seller();
            seller.setSellerName(sellerName);
            seller.setSellerEmail(sellerEmail);
            seller.setSellerTelephone(sellerTelephone);
            seller.setSellerPassword(sellerPassword);

            register = sellerService.sellerRegister(seller);

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
            return "redirect:/sellerLogin";
        }
        else
        {
            return "redirect:/sellerLogin";
        }
    }

    @Override
    @RequestMapping("/toSellerChange")
    public String processChange(HttpServletRequest request, String sellerEmail, Long sellerTelephone, Character sellerGender, String descriptions) {
        boolean flag = false;
        if(sessionService.checkUserLogin(request.getSession())) {
            Seller user = new Seller();
            user.setSellerName((String)sessionService.getAttr(request.getSession(), "sellerName"));
            user.setSellerEmail(sellerEmail);
            user.setSellerTelephone(sellerTelephone);
            user.setSellerGender(sellerEmail);
            user.setSellerDescription(descriptions);

            flag = sellerService.editSeller(user);
        }
        else
        {
            flag = false;
        }

        if(flag)
        {
            return "redirect:/seller";
        }
        else
        {
            return "redirect:/seller";
        }
    }

    @Override
    @RequestMapping("/toShowSellerInfo")
    @ResponseJSONP
    public JSONObject showSellerInfo(HttpServletRequest request) {
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            Seller seller = sellerService.getSeller((String)sessionService.getAttr(request.getSession(), "sellerName"));
            return (JSONObject) JSONObject.toJSON(seller);
        }
        else
        {
            return null;
        }
    }

    @Override
    @RequestMapping("/toSellerLogout")
    public String processLogout(HttpServletRequest request) {
        sessionService.logout(request.getSession());
        return "redirect:/sellerLogin";
    }

    @Override
    @RequestMapping("/checkSellerName")
    @ResponseJSONP
    public JSONObject checkSellerName(String sellerName) {
        boolean result = sellerService.checkSellerName(sellerName);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("valid", result);
        return jsonObject;
    }
}
