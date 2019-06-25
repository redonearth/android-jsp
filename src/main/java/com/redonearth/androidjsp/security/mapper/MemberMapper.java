package com.redonearth.androidjsp.security.mapper;

import com.redonearth.androidjsp.security.domain.Member;

import java.util.List;

public interface MemberMapper {
    public Member readUser(String userID);
    public List<String> readAuthority(String userID);
}
