package com.example.Interview.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Interview.model.Question;

public interface QuestionRepository extends MongoRepository<Question, String> {
    List<Question> findByTopicId(String topicId);
}