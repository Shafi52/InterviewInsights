package com.example.Interview.controller;

import com.example.Interview.services.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin("*")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/dsa")
    public String getDsaDashboard() {
        return dashboardService.getDsaDashboardData();
    }

    @GetMapping("/aptitude")
    public String getAptitudeDashboard() {
        return dashboardService.getAptitudeDashboardData();
    }

    @GetMapping("/company-info")
    public String getCompanyDashboard() {
        return dashboardService.getCompanyInfoDashboardData();
    }
}