package Controllers;

import Entities.Student;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private Student existingStudent = new Student(101, "Mawadda", "A");


    @PutMapping("/updateStudent")
    public String updateStudentName(@RequestParam String name){
        String previousName = existingStudent.getStudentName();
        existingStudent.setStudentName(name);

        return "Student Name Updated Successfully" + "previous Name: " + previousName +
                "New Name: " + existingStudent.getStudentName();
    }

}

