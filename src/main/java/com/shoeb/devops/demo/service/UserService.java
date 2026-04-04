package com.shoeb.devops.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getRole(String user) {
        if(user.equals("shoeb")) return "ADMIN";
        if(user.equals("rizwan")) return "DEVELOPER";
        return "VIEWER";
    }
}
