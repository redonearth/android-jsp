package com.redonearth.androidjsp.repository;

import com.redonearth.androidjsp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    void insertUser(User user);
    User selectUserById(String userID);
    User selectUserByIdPassword(String userID, String userPassword);
}
