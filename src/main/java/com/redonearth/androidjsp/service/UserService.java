package com.redonearth.androidjsp.service;

import com.redonearth.androidjsp.model.User;
import com.redonearth.androidjsp.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    User insertUser(User user) throws Exception {
        return userMapper.insertUser(user);
    }

    public User selectUserById(String userID) throws Exception {
        return userMapper.selectUserById(userID);
    }

    User selectUserByIdPassword(String userID, String userPassword) throws Exception {
        return userMapper.selectUserByIdPassword(userID, userPassword);
    }
}
