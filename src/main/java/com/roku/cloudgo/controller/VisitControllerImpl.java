package com.roku.cloudgo.controller;

import com.roku.cloudgo.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class VisitControllerImpl implements VisitController {
    @Autowired
    SessionService sessionService;

    @Override
    @RequestMapping("/index")
    public String index(HttpServletRequest request)
    {
        if(sessionService.checkUserLogin(request.getSession()))
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
        if(sessionService.checkUserLogin(request.getSession()))
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
            return "redirect:/sellerLogin";
        }
    }

    @Override
    @RequestMapping("/sellerIndex")
    public String sellerIndex(HttpServletRequest request) {
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            return "sellerIndex";
        }
        else
        {
            return "redirect:/sellerLogin";
        }
    }

    @Override
    @RequestMapping("/sellerLogin")
    public String sellerLogin(HttpServletRequest request) {
        if(sessionService.checkSellerLogin(request.getSession()))
        {
            return "sellerIndex";
        }
        else
        {
            return "sellerLoginAndRegister";
        }
    }

    @RequestMapping("/test")
    public String testUpload()
    {
        return "imageUploadExample";
    }

//    @Override
//    @RequestMapping("/error")
//    public ModelAndView error(Exception e)
//    {
//        ModelAndView m = new ModelAndView();
//        m.addObject("errorMsg", e.getMessage());
//        m.setViewName("error");
//        return m;
//    }
}
