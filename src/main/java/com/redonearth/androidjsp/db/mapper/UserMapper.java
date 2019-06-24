package com.redonearth.androidjsp.db.mapper;

import com.redonearth.androidjsp.db.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User insertUser(User user) throws Exception;
    List<User> selectUserById(@Param("userID") String userID) throws Exception;
    List<User> selectUserByIdAndPassword(@Param("userID") String userID, @Param("userPassword") String userPassword) throws Exception;
    List<User> selectAllUsers() throws Exception;
}
