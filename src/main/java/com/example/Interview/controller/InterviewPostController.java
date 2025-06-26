package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.InterviewPosts;
import com.example.Interview.services.InterviewPostService;

@RestController
public class InterviewPostController {
	
	@Autowired
	InterviewPostService postser;
	
	@PostMapping("/post")
	public String newpost(@RequestBody InterviewPosts post) {
		return postser.addnewpost(post);
	}
	
	@GetMapping("/getallpost")
	public List<InterviewPosts> get(){
		return postser.getallpost();
	}

}
