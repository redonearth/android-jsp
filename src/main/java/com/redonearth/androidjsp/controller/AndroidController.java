package com.redonearth.androidjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AndroidController {

    @RequestMapping("/hello")
    public String HelloSpringBoot() {
        return "hello";
    }
}
