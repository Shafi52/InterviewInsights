package com.example.Interview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Interview.model.Users;
import com.example.Interview.repository.LoginRepo;
import com.example.Interview.repository.InterviewPostRepo;

@Service
public class LoginServices {
	
	@Autowired
	public LoginRepo loginrepo;
	
	@Autowired
	InterviewPostRepo postrepo;

	public List<Users> getallusers() {
		return loginrepo.findAll();
	}

	public String login(String username, String password) {
		Users user=loginrepo.findByUsername(username);
		if(user!=null) {
			if(user.getPassword().equals(password))
				return "Login succesfully";
			else
				return "Incorect password";
		}
		return "User name does not exist";
	}

	public String addnewuser(Users newuser) {
		Users user=loginrepo.findByUsername(newuser.getUsername());
		
		Users email=loginrepo.findByEmail(newuser.getEmail());
		if(user!=null)
			return "User id is already exist";
		else if(email != null) {
			return "Email is already try another email";
		}
		else {
			Users Auser=new Users();
			Auser.setUsername(newuser.getUsername());
			Auser.setEmail(newuser.getEmail());
			Auser.setPassword(newuser.getPassword());
			loginrepo.save(Auser);
			return "Now we can login";
		}
	}
	
	

}
