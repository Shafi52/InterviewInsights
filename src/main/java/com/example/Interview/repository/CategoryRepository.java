package com.example.Interview.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Interview.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
	
}

