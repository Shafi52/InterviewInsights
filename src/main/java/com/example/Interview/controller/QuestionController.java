package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.Question;
import com.example.Interview.repository.QuestionRepository;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepo;

    
    @GetMapping("/topic/{topicId}")
    public List<Question> getQuestionsByTopic(@PathVariable String topicId) {
        return questionRepo.findByTopicId(topicId);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionRepo.save(question);
    }
}
