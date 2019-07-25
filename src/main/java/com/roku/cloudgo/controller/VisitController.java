package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public interface VisitController {
    @RequestMapping("/index")
    String index(HttpServletRequest request);

    @RequestMapping({"/login", "/"})
    String login(HttpServletRequest request);
}
