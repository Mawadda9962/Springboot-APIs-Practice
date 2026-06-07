package com.example.D_Java;

import com.example.D_Java.Services.libraryManager;

public class libraryDemo {
    public static void main(String[] args){

        libraryManager libraryManager = new libraryManager();

        System.out.println("Before Deletion :");
        libraryManager.displayMembers();
        System.out.println(); // Adds a clean empty line

        Integer memberId = 102;

        if (libraryManager.deleteMemberById(memberId)) {
            System.out.println("Member " + memberId + " deleted successfully.");
        } else {
            System.out.println("Member not found.");
        }
        System.out.println();

        System.out.println("After Deletion:");
        libraryManager.displayMembers();
    }
}