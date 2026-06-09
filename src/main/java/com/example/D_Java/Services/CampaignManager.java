package com.example.D_Java.Services;

import com.example.D_Java.Entities.Campaign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CampaignManager {

    private List<Campaign> campaignList = new ArrayList<>();

    public CampaignManager() {
        campaignList.add(new Campaign("C101", "Summer Sale", "Instagram", 500));
        campaignList.add(new Campaign("C102", "Black Friday", "Google Ads", 1000));
        campaignList.add(new Campaign("C103", "Email Promo", "Email", 300));
    }
    public List<Campaign> getAllCampaigns() {
        return campaignList;
    }

    public String addCampaign(Campaign campaign) {

        for (Campaign c : campaignList) {
            if (c.getCampaignId().equalsIgnoreCase(campaign.getCampaignId())) {
                return "\"Campaign ID already exists";
            }
        }
            campaignList.add(campaign);
            return "Campaign Created Successfully" +
                    "Campaign ID: " + campaign.getCampaignId() +
                    "Campaign Name: " + campaign.getCampaignName() +
                    "Platform: " + campaign.getPlatform() +
                    "Budget: " + campaign.getBudget() +
                    "Status: Active";
        }
    }

