package com.example.Interview.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dashboard_stats")
public class Dashboard {

    @Id
    private String id;

    private long dsaCount;
    private long aptitudeCount;
    private long companyCount;

    // Constructors
    public Dashboard() {}

    public Dashboard(long dsaCount, long aptitudeCount, long companyCount) {
        this.dsaCount = dsaCount;
        this.aptitudeCount = aptitudeCount;
        this.companyCount = companyCount;
    }

    // Getters and Setters
    public long getDsaCount() {
        return dsaCount;
    }

    public void setDsaCount(long dsaCount) {
        this.dsaCount = dsaCount;
    }

    public long getAptitudeCount() {
        return aptitudeCount;
    }

    public void setAptitudeCount(long aptitudeCount) {
        this.aptitudeCount = aptitudeCount;
    }

    public long getCompanyCount() {
        return companyCount;
    }

    public void setCompanyCount(long companyCount) {
        this.companyCount = companyCount;
    }
}