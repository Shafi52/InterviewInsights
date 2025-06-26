package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.Category;
import com.example.Interview.repository.CategoryRepository;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping
    public List<Category> getAllCategories() {
        return repo.findAll();
    }

    @PostMapping
    public Category add(@RequestBody Category cat) {
        return repo.save(cat);
    }
}
