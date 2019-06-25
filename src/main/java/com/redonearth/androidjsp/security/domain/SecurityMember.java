package com.redonearth.androidjsp.security.domain;

import org.springframework.security.core.userdetails.User;

public class SecurityMember extends User {

    private static final long serialVersionUID = 1L;
    private String ip;

    public SecurityMember(Member member) {
        super(member.getUserID(), member.getUserPassword(), member.getAuthorities());
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
