package com.example.Interview.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Interview.model.ApptitudeQuestion;
@Repository
public interface ApptitudeRepository extends MongoRepository<ApptitudeQuestion, String>{

}
