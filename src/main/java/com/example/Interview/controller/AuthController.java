package com.example.Interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.Users;
//import com.example.Interview.service.AuthService;
import com.example.Interview.services.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return authService.login(user.getUsername(), user.getPassword());
    }

    @PostMapping("/register")
    public String register(@RequestBody Users user) {
        return authService.register(user);
    }
}