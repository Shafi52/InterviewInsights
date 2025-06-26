package com.example.Interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Interview.model.Topic;
import com.example.Interview.repository.TopicRepository;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Autowired
    private TopicRepository topicRepo;
  
    @GetMapping("/category/{categoryId}")
    public List<Topic> getByCategory(@PathVariable String categoryId) {
        return topicRepo.findByCategoryId(categoryId);
    }

    @PostMapping
    public Topic add(@RequestBody Topic topic) {
        return topicRepo.save(topic);
    }
}