package com.redonearth.androidjsp.security.controller;

import com.redonearth.androidjsp.security.domain.Member;
import com.redonearth.androidjsp.security.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    MemberMapper memberMapper;

    @RequestMapping("/openapi/readUser/{userID}")
    public @ResponseBody String openApiReadUser(@PathVariable String userID) {
        Member member = memberMapper.readUser(userID);
        return member.getUserEmail();
    }

    @RequestMapping("/openapi/readAuthority/{userID}")
    public @ResponseBody String openApiReadAuthority(@PathVariable String userID) {
        List<String> auths = memberMapper.readAuthority(userID);

        StringBuffer buf = new StringBuffer();
        for(String auth : auths) {
            buf.append(auth);
            buf.append(" ");
        }
        return buf.toString();
    }
}
