package com.roku.cloudgo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface VisitController {
    @RequestMapping("/index")
    String index();

    @RequestMapping({"/login", "/"})
    String login();
}
