package com.ua.codespace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping
    @ResponseBody
    public String hello() {
        return "<h1>Hello!</h1>";
    }
}
