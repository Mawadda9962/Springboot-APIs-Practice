package com.example.D_Java.Controllers;

import com.example.D_Java.Entities.Campaign;
import com.example.D_Java.Entities.Vehicle;
import com.example.D_Java.Services.CampaignManager;
import com.example.D_Java.Services.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("campaigns")
public class CampaignController {

    @Autowired
    CampaignManager campaignManager;

    @GetMapping
    public List<Campaign> getAllCampaign(){
        return campaignManager.getAllCampaigns();
    }

    @PostMapping
    public String addCampaign(@RequestBody Campaign campaign){
        return campaignManager.addCampaign(campaign);
    }

}
