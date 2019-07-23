package com.roku.cloudgo.controller;

import com.roku.cloudgo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController 默认返回json
@Controller
@RequestMapping("/example")
public class ExampleController {
    @Autowired
    private ExampleService exampleService;

    @RequestMapping("/hello")
    public String hello()
    {
        return "example";
    }

    @RequestMapping("/getAge")
    @ResponseBody
    public String getAge(@RequestParam("name") String name)
    {
        return String.valueOf(exampleService.getAgeByName(name));
    }
}
