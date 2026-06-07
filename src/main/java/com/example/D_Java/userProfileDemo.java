package com.example.D_Java;

import com.example.D_Java.Entities.userProfile;

public class userProfileDemo {
    public static void main(String[] args){

        userProfile user = new userProfile(1001, "92965487", "Muscat");

        System.out.println("********** User Profile Information ***********");
        System.out.println("User Id: " + user.getUserId());
        System.out.println("User phone Number: " + user.getPhoneNumber());
        System.out.println("User Address: " + user.getAddress());


        user.setPhoneNumber("965577743");
        user.setAddress("Sohar");


        System.out.println("********** Updated User Profile **********");
        System.out.println("User Id: " + user.getUserId());
        System.out.println("User phone Number: " + user.getPhoneNumber());
        System.out.println("User Address: " + user.getAddress());
    }
}

