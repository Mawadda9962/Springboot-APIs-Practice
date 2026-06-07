package com.example.D_Java;

public class UpdateDemo {
    public static void main(String[] args){
        String CurrentStudentName = "Mawadda";
        String NewStudentName = "Jehad";
        boolean isUpdateSuccessful = false;
        String UpdateStateMassage = " ";

        //3
        System.out.println("Current Student Name in System: " + CurrentStudentName);
        System.out.println("New Student Name: " + NewStudentName);

        //4
        System.out.println(CurrentStudentName.equals(NewStudentName));

        if (!CurrentStudentName.equals(NewStudentName)){
            System.out.println("Names are Different");


        }
    }

}
