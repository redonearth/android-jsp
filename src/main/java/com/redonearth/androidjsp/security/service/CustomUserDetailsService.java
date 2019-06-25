package com.redonearth.androidjsp.security.service;

import com.redonearth.androidjsp.security.domain.Member;
import com.redonearth.androidjsp.security.domain.SecurityMember;
import com.redonearth.androidjsp.security.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private static final String ROLE_PREFIX = "ROLE_";

    @Autowired
    MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String userID) throws UsernameNotFoundException {

        Member member = memberMapper.readUser(userID);
        if(member != null) {
            member.setAuthorities(makeGrantedAuthority(memberMapper.readAuthority(userID)));
        }
        return new SecurityMember(member);
    }

    private static List<GrantedAuthority> makeGrantedAuthority(List<String> roles) {
        List<GrantedAuthority> list = new ArrayList<>();
        roles.forEach(role -> list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role)));
        return list;
    }
}
