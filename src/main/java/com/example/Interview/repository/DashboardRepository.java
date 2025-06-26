package com.example.Interview.repository;

//import com.example.Interviewr.model.Dashboard;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Interview.model.Dashboard;

public interface DashboardRepository extends MongoRepository<Dashboard, String> {}