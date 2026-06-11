package com.example.D_Java.Interfaces;

import com.example.D_Java.Entities.Employee;
import com.example.D_Java.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {


}
