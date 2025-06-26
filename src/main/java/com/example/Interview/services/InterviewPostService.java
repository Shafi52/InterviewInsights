package com.example.Interview.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interview.model.InterviewPosts;
import com.example.Interview.repository.InterviewPostRepo;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class InterviewPostService {

	 ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	 String formatted = indiaTime.format(formatter);
	 
	 @Autowired
	 InterviewPostRepo postrepo;
	public String addnewpost(InterviewPosts newpost) {
		InterviewPosts post=new InterviewPosts();
		post.setUsername(newpost.getUsername());
		post.setCompanyname(newpost.getCompanyname());
		post.setDes(newpost.getDes());
		post.setDate(formatted);
		postrepo.save(post);
//		System.out.println(newpost.getCompanyname()+" "+newpost.getDes());
		return "Post success";
	}
	public List<InterviewPosts> getallpost() {
		// TODO Auto-generated method stub
		return postrepo.findAll();
	}

}
