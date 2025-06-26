package com.example.Interview.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ApptitudeQuestions")
public class ApptitudeQuestion {
	
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correct;
	private String vaildation;
	private String useranswer;
	public String getUseranswer() {
		return useranswer;
	}
	public void setUseranswer(String useranswer) {
		this.useranswer = useranswer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	public String getVaildation() {
		return vaildation;
	}
	public void setVaildation(String vaildation) {
		this.vaildation = vaildation;
	}

}
