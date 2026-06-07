package com.example.D_Java;

public class StudentController {
    public static void main(String[] args){

        Student student = new Student(101, "Mawadda", "A");

        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grade: " + student.getGrade());


        student.setGrade("B");
        student.setStudentName("Ahmed");


        System.out.println("Student Id:" + student.getStudentId()) ;

    }
}
