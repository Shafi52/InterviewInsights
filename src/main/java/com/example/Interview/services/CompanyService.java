package com.example.Interview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Interview.model.Company;
import com.example.Interview.repository.CompanyRepository;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepo;

    public List<Company> getAllCompanies() {
        return companyRepo.findAll();
    }

    public List<Company> searchCompanies(String keyword) {
        return companyRepo.findByNameContainingIgnoreCase(keyword);
    }

    public List<Company> filterByType(String type) {
        return companyRepo.findByType(type);
    }

    public Company getCompanyById(String id) {
        return companyRepo.findById(id).orElse(null);
    }

	public String addnewcompany(Company newcomp) {
		Company company=new Company();
		company.setDescription(newcomp.getDescription());
		company.setLocation(newcomp.getLocation());
		company.setName(newcomp.getName());
		company.setType(newcomp.getType());
		companyRepo.save(company);
		return "add succesfully";
	}
}