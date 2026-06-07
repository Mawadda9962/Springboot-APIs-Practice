package com.example.D_Java;

public class UserProfileDemo {
    public static void main(String[] args){

        UserProfile user = new UserProfile(1001, "92965487", "Muscat");

        System.out.println("User Id: " + user.getUserId());
        System.out.println("User phone Number: " + user.getPhoneNumber());
        System.out.println("User Address: " + user.getAddress());

    }
}
