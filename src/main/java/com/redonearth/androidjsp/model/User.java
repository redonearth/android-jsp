package com.redonearth.androidjsp.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
public class User {
    private String userID;
    private String userPassword;
    private String userEmail;

    public User() {}

    public User(String userID, String userPassword, String userEmail) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }
}
