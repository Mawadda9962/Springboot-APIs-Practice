package com.example.D_Java.Services;

import com.example.D_Java.Entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee("E101", "Sara", "HR"));
        employeeList.add(new Employee("E102", "Ahmed", "Finance"));
        employeeList.add(new Employee("E103", "John", "Engineering"));
    }

        public List<Employee> getAllEmployee() {
            return employeeList;

        }

        public String addEmployee(Employee newEmployee){

        for (Employee emp : employeeList) {
            if (emp.getEmployeeId().equalsIgnoreCase(newEmployee.getEmployeeId())) {
                return "Employee ID already Exists";
            }
        }
        employeeList.add(newEmployee);

        return "Employee Added Successfully" + "Employee ID: " + newEmployee.getEmployeeId() + "\n" + "Employee Name: " + newEmployee.getEmployeeName() + "\n" + "Department: " + newEmployee.getDepartment() + "\n" + "Status: Created";
    }


}
