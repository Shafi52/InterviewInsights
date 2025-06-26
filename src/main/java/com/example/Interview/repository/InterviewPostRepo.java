package com.example.Interview.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Interview.model.InterviewPosts;

@Repository
public interface InterviewPostRepo extends MongoRepository<InterviewPosts,String>{

}
