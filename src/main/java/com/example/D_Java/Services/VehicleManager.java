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
        boolean exists = false;

        for (Vehicle v : vehicleList) {
            if (v.getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())) {
                exists = true;
                break;
            }
        }

        if (exists) {
            return "Vehicle ID already exists";
        } else {
            vehicleList.add(vehicle);
            return "Vehicle Added Successfully" +
                    "Vehicle ID: " + vehicle.getVehicleId() +
                    "Vehicle Model: " + vehicle.getVehicleModel() +
                    "Rental Price Per Day: " + vehicle.getRentalPricePerDay() ;
        }
    }

    //7.	Add Display Method
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        System.out.println("=== Vehicle List ===");
        for (Vehicle v : manager.getAllVehicles()) {
            System.out.println(v.getVehicleId() + " -> " + v.getVehicleModel() + " -> " + v.getRentalPricePerDay() + " OMR");
        }

        // Test the POST Operation
        Vehicle newCar = new Vehicle("V104", "Kia Sportage", 30);
        System.out.println("\nPOST Request Simulation: Adding New Vehicle...");
        System.out.println(manager.addVehicle(newCar));

        System.out.println("\nNew Vehicle List");
        for (Vehicle v : manager.getAllVehicles()) {
            System.out.println(v.getVehicleId() + " -> " + v.getVehicleModel() + " -> " + v.getRentalPricePerDay() + " OMR");
        }
    }
}
