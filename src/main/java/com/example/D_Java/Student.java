package com.example.D_Java;

public class Student {
    private Integer StudentId;
    private String StudentName;
    private String Grade;


    public Student(Integer studentId, String studentName, String grade) {
        StudentId = studentId;
        StudentName = studentName;
        Grade = grade;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getGrade() {
        return Grade;
    }


}


