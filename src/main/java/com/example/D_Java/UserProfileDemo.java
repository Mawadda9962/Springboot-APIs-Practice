package com.example.D_Java;

import Entities.UserProfile;

public class UserProfileDemo {
    public static void main(String[] args){

        UserProfile user = new UserProfile(1001, "92965487", "Muscat");

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

