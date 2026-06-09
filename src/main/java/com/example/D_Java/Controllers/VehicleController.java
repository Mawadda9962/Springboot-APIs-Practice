package com.example.D_Java.Controllers;

import com.example.D_Java.Entities.Vehicle;
import com.example.D_Java.Services.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class VehicleController {
    @Autowired
    VehicleManager vehicleManager;

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleManager.getAllVehicles();
    }

    @PostMapping
    public String addVehicle(@RequestBody Vehicle vehicle){
        return vehicleManager.addVehicle(vehicle);
    }



}
