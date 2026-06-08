package com.example.D_Java.Services;

import com.example.D_Java.Entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public static void main(String[] args){


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("E101", "Sara", "HR"));
        employeeList.add(new Employee("E102", "Ahmed", "Finance"));
        employeeList.add(new Employee("E103", "John", "Engineering"));


        System.out.println(" Employee List ");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }


        Employee newEmployee = new Employee("E104", "Ahmed Ali", "IT");

        boolean exists = false;

        for (Employee emp : employeeList) {
            if (emp.getEmployeeId().equalsIgnoreCase(newEmployee.getEmployeeId())) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Employee ID already exists");
        } else {
            // If it does not exist, safely add employee to your list collection
            employeeList.add(newEmployee);

            // Display success message matching the expected assignment output format
            System.out.println("Output:");
            System.out.println("Employee Added Successfully");
            System.out.println("Employee ID: " + newEmployee.getEmployeeId());
            System.out.println("Employee Name: " + newEmployee.getEmployeeName());
            System.out.println("Department: " + newEmployee.getDepartment());
            System.out.println("Status: Created");

    }





}
