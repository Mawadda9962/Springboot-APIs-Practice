package Entities;

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


    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }


}


