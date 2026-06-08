package com.example.D_Java;

import com.example.D_Java.Entities.Student;

public class UpdateDemo {
    public static void main(String[] args){
        String CurrentStudentName = "Mawadda";
        String NewStudentName = "Jehad";
        boolean isUpdateSuccessful = false;


        System.out.println("Current Student Name in System: " + CurrentStudentName);
        System.out.println("New Student Name: " + NewStudentName);

        System.out.println(CurrentStudentName.equals(NewStudentName));

        if (!CurrentStudentName.equals(NewStudentName)){
            System.out.println("Names are Different");

            CurrentStudentName=NewStudentName;
            isUpdateSuccessful = true;
            System.out.println("The Student Name has Successfully Updated");

        }else {
            isUpdateSuccessful =false;
            System.out.println("The existing value already matches the new value");
        }

        System.out.println("Final Student Name: " + CurrentStudentName);
        System.out.println("The update status: " + isUpdateSuccessful);


        Student student = new Student(101, "Mawadda", "A");

        System.out.println("*********Initial Student Details********");
        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grade: " + student.getGrade());

        student.setStudentName("Ahmed");

        System.out.println("*********Updated Student Detail**********");
        System.out.println("Student Id:" + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Garde: " + student.getGrade());

    }

}
