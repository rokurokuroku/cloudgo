package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface VisitController {
    @RequestMapping("/index")
    String index(HttpServletRequest request);

    @RequestMapping({"/login", "/"})
    String login(HttpServletRequest request);

    @RequestMapping("/sellerIndex")
    String sellerIndex(HttpServletRequest request);

    @RequestMapping({"/sellerLogin", "/"})
    String sellerLogin(HttpServletRequest request);

    @RequestMapping("/user")
    String user(HttpServletRequest request);

    @RequestMapping("/seller")
    String seller(HttpServletRequest request);

//    @RequestMapping("error")
//    ModelAndView error(Exception e);
}
