package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.Comment;
import com.example.Interview.services.CommentService;
@RestController
@RequestMapping("/comment")
@CrossOrigin("*")
public class CommentController {

    @Autowired
    private CommentService feedbackService;

    @PostMapping("/add")
    public String addFeedback(@RequestBody Comment feedback) {
        return feedbackService.addComment(feedback);
    }

    @GetMapping("/all")
    public List<Comment> getAllFeedback() {
        return feedbackService.getAllComments();
    }
}