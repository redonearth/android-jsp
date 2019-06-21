package com.redonearth.androidjsp.db.controller;

import com.redonearth.androidjsp.db.dto.User;
import com.redonearth.androidjsp.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/UserLogin")
    public List<User> UserLogin(@RequestParam String userID, String userPassword) throws Exception {
        return userService.selectUserByIdAndPassword(userID, userPassword);
    }

//    @RequestMapping("/UserRegister")
//    public String UserRegister() {
//        return "UserRegister";
//    }

//    @RequestMapping("/UserValidate")
//    public String UserValidate() {
//        return "UserValidate";
//    }
}
