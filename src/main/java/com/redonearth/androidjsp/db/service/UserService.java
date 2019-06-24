package com.redonearth.androidjsp.db.service;

import com.redonearth.androidjsp.db.dto.User;
import com.redonearth.androidjsp.db.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User insertUser(User user) throws Exception {
        return userMapper.insertUser(user);
    }

    public List<User> selectUserById(@Param("userID") String userID) throws Exception {
        return userMapper.selectUserById(userID);
    }

    public List<User> selectUserByIdAndPassword(@Param("userID") String userID, @Param("userPassword") String userPassword) throws Exception {
        return userMapper.selectUserByIdAndPassword(userID, userPassword);
    }

    public List<User> selectAllUsers() throws Exception {
        return userMapper.selectAllUsers();
    }
}
