package com.roku.cloudgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController 默认返回json
@Controller
@RequestMapping("/example")
public class ExampleController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "example";
    }
}
