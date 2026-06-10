package com.example.D_Java.Demo;

public class UpdateEmailDemo {
    public static void main(String[] args){
        String CurrentEmailAddress = "Mawadda@gmail.com";
        String NewEmailAddress = "Mawadda.alshukaili@gmail.com";
        boolean isUpdated = false;


        System.out.println("Original Email Address: " + CurrentEmailAddress);
        System.out.println("New Email Address: " + NewEmailAddress);

        System.out.println(CurrentEmailAddress.equalsIgnoreCase(NewEmailAddress));


        if (!CurrentEmailAddress.equalsIgnoreCase(NewEmailAddress)){
            CurrentEmailAddress = NewEmailAddress;
            isUpdated = true;
            System.out.println("The Email Address is Updated successfully");
        }else {
            isUpdated = false;
            System.out.println("No Update is required");
        }

        System.out.println("Final System Email: " + CurrentEmailAddress);
        System.out.println("Updated State: " + isUpdated);


    }


}
