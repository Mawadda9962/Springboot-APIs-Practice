package com.example.D_Java.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehicle {
     private String vehicleId;
     private String vehicleModel;
     private Integer rentalPricePerDay;
}
