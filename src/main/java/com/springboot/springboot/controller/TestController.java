package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello world~");
        return "success";
    }

}
