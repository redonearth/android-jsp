package com.redonearth.androidjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AndroidController {

    @RequestMapping(value="/user-register")
    public String UserRegister() {
        return "UserRegister";
    }

    @RequestMapping(value="/user-validate")
    public String UserValidate() {
        return "UserValidate";
    }

    @RequestMapping(value="/user-login")
    public String UserLogin() {
        return "UserLogin";
    }

    @RequestMapping(value="/hello")
    public String HelloSpringBoot() {
        return "hello";
    }
}
