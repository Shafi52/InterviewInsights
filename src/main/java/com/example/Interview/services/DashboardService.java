package com.example.Interview.services;

import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    public String getDsaDashboardData() {
        // In a real application, this might fetch data from a DB or perform logic
        return "DSA Dashboard Data";
    }

    public String getAptitudeDashboardData() {
        return "Aptitude Dashboard Data";
    }

    public String getCompanyInfoDashboardData() {
        return "Company Info Dashboard Data";
    }
}