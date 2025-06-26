package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.ApptitudeQuestion;
import com.example.Interview.services.ApptitudeService;

@RestController
public class ApptitudeController {
	
	
	@Autowired
	ApptitudeService apptitudeservice;
	
	@GetMapping("/apptitude")
	public List<ApptitudeQuestion> getallapptitudequestion() {
		return apptitudeservice.getallquestions();
	}
	
	@PostMapping("/post-apptitude-question")
	public void postquestion(@RequestBody ApptitudeQuestion question) {
		apptitudeservice.postallquestions(question);
	}
		

}
