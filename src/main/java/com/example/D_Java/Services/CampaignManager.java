package com.example.D_Java.Services;

import com.example.D_Java.Entities.Company;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {

    private List<Company> campaignList = new ArrayList<>();

    // 2. Constructor to automatically load the 3 sample campaigns from Task 40 on startup
    public CampaignManager() {
        campaignList.add(new Company("C101", "Summer Sale", "Instagram", 500));
        campaignList.add(new Company("C102", "Black Friday", "Google Ads", 1000));
        campaignList.add(new Company("C103", "Email Promo", "Email", 300));
    }


}
