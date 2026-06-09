package com.example.D_Java.Services;

import com.example.D_Java.Entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class VehicleManager {
    private List<Vehicle> vehicleList = new ArrayList<>();

    public VehicleManager() {
        vehicleList.add(new Vehicle("V101", "Toyota Corolla", 20));
        vehicleList.add(new Vehicle("V102", "Nissan Sunny", 18));
        vehicleList.add(new Vehicle("V103", "Hyundai Elantra", 22));
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleList;
    }

    public String addVehicle(Vehicle vehicle) {

        for (Vehicle v : vehicleList) {
            if (v.getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())) {
                return "Vehicle ID already exists";
            }
        }
            vehicleList.add(vehicle);
            return "Vehicle Added Successfully" +
                    "Vehicle ID: " + vehicle.getVehicleId() +
                    "Vehicle Model: " + vehicle.getVehicleModel() +
                    "Rental Price Per Day: " + vehicle.getRentalPricePerDay() ;
        }
    }
