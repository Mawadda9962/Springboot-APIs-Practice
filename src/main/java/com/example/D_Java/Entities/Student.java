package com.example.D_Java.Entities;

public class Student {
    private Integer studentId;
    private String studentName;
    private String Grade;


    public Student(Integer studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        Grade = grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGrade() {
        return Grade;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }


}


