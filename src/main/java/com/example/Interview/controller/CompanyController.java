package com.example.Interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interview.model.Company;
import com.example.Interview.services.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "*")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @GetMapping("/search")
    public List<Company> searchCompanies(@RequestParam String name) {
    	System.out.println(name);
        return companyService.searchCompanies(name);
    }

    @GetMapping("/filter")
    public List<Company> filterCompanies(@RequestParam String type) {
        return companyService.filterByType(type); // "product" or "service"
    }

    @GetMapping("/searchbyid{id}")
    public Company getCompanyById(@PathVariable String id) {
        return companyService.getCompanyById(id);
    }
    
    @PostMapping("/newcompany")
    public String addcompany(@RequestBody Company newcomp) {
    	return companyService.addnewcompany(newcomp);
    }
}