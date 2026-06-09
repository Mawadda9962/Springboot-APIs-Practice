package com.example.D_Java.Services;

import com.example.D_Java.Entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee("E101", "Sara", "HR",new ArrayList<>(),new ArrayList<>()));
        employeeList.add(new Employee("E102", "Ahmed", "Finance", new ArrayList<>(), new ArrayList<>()));
        employeeList.add(new Employee("E103", "John", "Engineering",new ArrayList<>(),new ArrayList<>()));
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

        return "Employee Added Successfully" + "Employee ID: " + newEmployee.getEmployeeId() + "\n" + "Employee Name: " + newEmployee.getEmployeeName() + "\n" + "Department: " +
                newEmployee.getDepartment() + "\n" + "Status: Created";
    }


}



//package com.example.tra.task.Services;
//
//import com.example.tra.task.Entities.Employee;
//import com.example.tra.task.Interfaces.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class EmployeeService {
//    @Autowired
//    EmployeeRepository employeeRepository;
//
// //getall
//    public List<Employee> getAllEmployee() {
//
//        return employeeRepository.findAll();
//
//    }
//
//    public Employee addEmployee(Employee newEmployee) {
//        if (employeeRepository.existsById(newEmployee.getEmpid())) {
//           throw new RuntimeException(
//                   "Employee ID is Already exist"
//           );
//        }
//        return employeeRepository.save(newEmployee);
//    }
//    //update :
//    public Employee updateEmployee(Integer id,String name, String department) {
//        Employee employee = employeeRepository.findById(id).get();
//        employee.setEmpName(name);
//        employee.setDepartment(department);
//        return employeeRepository.save(employee);
//    }
//
//    //Delete :
//
//    public String deleteEmployee(Integer id){
//        if (employeeRepository.existsById(id)){
//            return "ID NOT FOUND";
//        }
//        employeeRepository.deleteById(id);
//
//        return "DELETED";
//    }
//
//
//    public Employee getEmployeeById(Integer id) {
//        return employeeRepository.findById(id).get();
//    }
//
//    public String getEmployeeNameById(Integer id) {
//        return employeeRepository.findById(id).get().getEmpName();
//    }
//    public String getEmployeeDeptById(Integer id) {
//        return employeeRepository.findById(id).get().getDepartment();
//    }
//
//
//
//}