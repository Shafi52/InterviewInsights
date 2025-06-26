package com.example.Interview.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Interview.model.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
}