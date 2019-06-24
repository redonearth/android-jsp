package com.redonearth.androidjsp.db.controller;

import com.redonearth.androidjsp.db.dto.User;
import com.redonearth.androidjsp.db.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/UserRegister")
    public User UserRegister(@ModelAttribute User user) throws Exception {
        return userService.insertUser(user);
    }

    @RequestMapping(value="/UserValidate")
    public List<User> UserValidate(@RequestParam("userID") String userID) throws Exception {
        return userService.selectUserById(userID);
    }

    @RequestMapping(value="/UserLogin")
    public List<User> UserLogin(@RequestParam("userID") String userID, @RequestParam("userPassword") String userPassword) throws Exception {
        return userService.selectUserByIdAndPassword(userID, userPassword);
    }

    @RequestMapping(value="/UserList")
    public List<User> UserList() throws Exception {
        return userService.selectAllUsers();
    }
}
