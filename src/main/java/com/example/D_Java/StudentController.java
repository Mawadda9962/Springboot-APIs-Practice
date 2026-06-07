package com.example.D_Java;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private Student existingStudent = new Student(101, "Mawadda", "A");


    @PutMapping("//updateStudent")
    public String updateStudentName(@RequestParam String name){
        String previousName = existingStudent.getStudentName();
        existingStudent.setStudentName(name);

    }


}

