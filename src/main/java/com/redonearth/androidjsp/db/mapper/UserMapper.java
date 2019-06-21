package com.redonearth.androidjsp.db.mapper;

import com.redonearth.androidjsp.db.dto.User;

import java.util.List;

public interface UserMapper {
    public User insertUser(User user) throws Exception;
    public List<User> selectUserById(String userID) throws Exception;
    public List<User> selectUserByIdAndPassword(String userID, String userPassword) throws Exception;
}
