package com.example.Interview.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Interview.model.Topic;

public interface TopicRepository extends MongoRepository<Topic, String> {
    List<Topic> findByCategoryId(String categoryId);
}

