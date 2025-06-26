package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.Users;
import com.example.Interview.services.LoginServices;

@RestController
@CrossOrigin(origins="*")
public class LoginController {
	
	@Autowired
	public LoginServices loginservice;
	
	@GetMapping("/getusers")
	public List<Users> fetchallusers(){
		return loginservice.getallusers();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Users user) {
		return loginservice.login(user.getUsername(),user.getPassword());
		
	}
	
	@PostMapping("/register")
	public String addnewuser(@RequestBody Users user) {
		 return loginservice.addnewuser(user);
		
	}
}
