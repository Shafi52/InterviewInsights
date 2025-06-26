package com.example.Interview.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interview.model.Users;
import com.example.Interview.repository.LoginRepo;

@Service
public class AuthService {

    @Autowired
    private LoginRepo loginRepo;

    // ✅ Login method
    public String login(String username, String password) {
        Users user = loginRepo.findByUsername(username);

        if (user != null) {
            if (user.getPassword().equals(password)) {
                return "Login successful";
            } else {
                return "Incorrect password";
            }
        } else {
            return "User not found";
        }
    }

    // ✅ Register method
    public String register(Users newUser) {
        Users existingUsername = loginRepo.findByUsername(newUser.getUsername());
        Users existingEmail = loginRepo.findByEmail(newUser.getEmail());

        if (existingUsername != null) {
            return "Username already exists";
        } else if (existingEmail != null) {
            return "Email already exists";
        } else {
            loginRepo.save(newUser);
            return "Registration successful";
        }
    }
}