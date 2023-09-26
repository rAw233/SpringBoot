package com.springboot.springboot.controller;

import com.springboot.springboot.listener.MyHttpSessionListener;
import jakarta.servlet.http.HttpSession;
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

    @RequestMapping("/listener")
    @ResponseBody
    public String listener(){
        Integer online = MyHttpSessionListener.online;
        return "当前在线人数:"+online;
    }

    @RequestMapping("/addSession")
    @ResponseBody
    public String addSession(HttpSession httpSession){
        httpSession.setAttribute("aaaa","bbbb");
        return "请求成功";
    }

}
