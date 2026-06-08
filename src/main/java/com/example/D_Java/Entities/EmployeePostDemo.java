package com.example.D_Java.Entities;

import java.util.ArrayList;
import java.util.List;

public class EmployeePostDemo {
    public static void main(String[] args){


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("E101", "Sara", "HR"));
        employeeList.add(new Employee("E102", "Ahmed", "Finance"));
        employeeList.add(new Employee("E103", "John", "Engineering"));
    }


}
