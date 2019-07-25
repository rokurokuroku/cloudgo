package com.roku.cloudgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisitControllerImpl implements VisitController {
    @Override
    @RequestMapping("/index")
    public String index()
    {
        // do something
        return "index";
    }

    @Override
    @RequestMapping({"/login", "/"})
    public String login()
    {
        // do something
        return "userLoginAndRegister";
    }
}
