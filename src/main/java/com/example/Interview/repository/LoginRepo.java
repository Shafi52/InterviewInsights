package com.example.Interview.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Interview.model.Users;

public interface LoginRepo extends MongoRepository<Users,String>{

	Users findByUsername(String username);

	Users findByEmail(String email);

	

}
