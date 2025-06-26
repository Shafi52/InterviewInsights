package com.example.Interview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interview.model.ApptitudeQuestion;
import com.example.Interview.repository.ApptitudeRepository;


@Service
public class ApptitudeService {
	
	@Autowired
	ApptitudeRepository apptituderepo;

	public List<ApptitudeQuestion> getallquestions() {
		return apptituderepo.findAll();
		// TODO Auto-generated method stub
		
		
	}

	public void postallquestions(ApptitudeQuestion question) {
		// TODO Auto-generated method stub
		ApptitudeQuestion aptitque=new ApptitudeQuestion();
		aptitque.setQuestion(question.getQuestion());
		aptitque.setOption1(question.getOption1());
		aptitque.setOption2(question.getOption2());
		aptitque.setOption3(question.getOption3());
		aptitque.setOption4(question.getOption4());
		aptitque.setCorrect(question.getCorrect());
		aptitque.setVaildation(question.getVaildation());
		apptituderepo.save(aptitque);
	}

}
