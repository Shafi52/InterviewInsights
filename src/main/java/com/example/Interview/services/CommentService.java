package com.example.Interview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interview.model.Comment;
import com.example.Interview.repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepo;

    public List<Comment> getAllComments() {
        return commentRepo.findAll();
    }

    public String addComment(Comment Comment) {
    	commentRepo.save(Comment);
        return "comment posted successfully";
    }
}