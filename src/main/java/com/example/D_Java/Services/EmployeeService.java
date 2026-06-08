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

    }





}
