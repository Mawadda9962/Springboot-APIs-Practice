package com.example.D_Java.Services;

import com.example.D_Java.Entities.Employee;
import com.example.D_Java.Interfaces.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


   private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(101, "Sara", "HR",new ArrayList<>(),new ArrayList<>()));
        employeeList.add(new Employee(102, "Ahmed", "Finance", new ArrayList<>(), new ArrayList<>()));
        employeeList.add(new Employee(103, "John", "Engineering",new ArrayList<>(),new ArrayList<>()));
    }

        public List<Employee> getAllEmployee() {
            return employeeList;

        }

        public String addEmployee(Employee newEmployee){

        for (Employee emp : employeeList) {
            if (emp.getEmployeeId().equals(newEmployee.getEmployeeId())) {
                return "Employee ID already Exists";
            }
        }
        employeeList.add(newEmployee);

        return "Employee Added Successfully" + "Employee ID: " + newEmployee.getEmployeeId() + " " + "Employee Name: " + newEmployee.getEmployeeName() + " " + "Department: " +
                newEmployee.getDepartment() + " " + "Status: Created";
    }


}
