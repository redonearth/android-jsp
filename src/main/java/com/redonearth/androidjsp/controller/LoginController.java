package com.redonearth.androidjsp.controller;

import com.redonearth.androidjsp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/UserRegister")
    public String UserRegister() {
        return "UserRegister";
    }

    @RequestMapping("/UserValidate")
    public String UserValidate() {
        return "UserValidate";
    }

    @RequestMapping("/UserLogin")
    public String UserLogin() {
        return "UserLogin";
    }
}
