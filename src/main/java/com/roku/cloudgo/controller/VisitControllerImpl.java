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
        if(checkLogin(request))
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
        if(checkLogin(request))
        {
            return "index";
        }
        else
        {
            return "userLoginAndRegister";
        }
    }

    private boolean checkLogin(HttpServletRequest request)
    {
        // 检查session确认是否登录
        String tmp = (String)sessionService.getAttr(request.getSession(), "userName");
        if(tmp==null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
