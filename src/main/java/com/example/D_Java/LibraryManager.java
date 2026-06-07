package com.example.D_Java;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members;

    public LibraryManager() {
        this.members = new ArrayList<>();
        initializeMembers();
    }


    private void initializeMembers() {
        addMember(new LibraryMember(101, "Ahmed", "Standard"));
        addMember(new LibraryMember(102, "Sara", "Premium"));
        addMember(new LibraryMember(103, "John", "Standard"));
    }

    public void addMember(LibraryMember member){
        this.members.add(member);
    }
}
