package com.example.D_Java;

import Services.LibraryManager;

public class LibraryDemo {
    public static void main(String[] args){

        LibraryManager libraryManager = new LibraryManager();

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