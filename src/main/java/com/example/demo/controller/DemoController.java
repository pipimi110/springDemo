package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

//@Controller
@RestController
public class DemoController {
    @RequestMapping("/index")
    public String sayHello(String input, HttpServletResponse response) throws Exception {
        return "index";// /templates/index.html
    }

    @RequestMapping("/servletEcho111")
    public String servletEcho() {
        System.out.println("isss");
        return "servletEcho";//resource\templates目录下新建同名html
    }
}