package com.roku.cloudgo.controller;

import com.roku.cloudgo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class VisitControllerImpl implements VisitController {
    @Autowired
    SessionService sessionService;

    @Override
    @RequestMapping("/index")
    public String index(HttpServletRequest request)
    {
        if(sessionService.checkLogin(request.getSession()))
        {
            return "index";
        }
        else
        {
            return "redirect:/login";
        }
    }

    @Override
    @RequestMapping({"/login", "/"})
    public String login(HttpServletRequest request)
    {
        if(sessionService.checkLogin(request.getSession()))
        {
            return "index";
        }
        else
        {
            return "userLoginAndRegister";
        }
    }

    @Override
    @RequestMapping("/user")
    public String user(HttpServletRequest request) {
        if(sessionService.checkUserLogin(request.getSession()))
        {
            return "user";
        }
        else
        {
            return "redirect:/login";
        }
    }

    @Override
    @RequestMapping("/seller")
    public String seller(HttpServletRequest request) {
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            return "seller";
        }
        else
        {
            return "redirect:/login";
        }
    }
}
