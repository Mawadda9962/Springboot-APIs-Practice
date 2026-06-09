package com.example.D_Java.Controllers;


import com.example.D_Java.Entities.Employee;
import com.example.D_Java.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
}
