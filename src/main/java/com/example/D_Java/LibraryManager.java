package com.example.D_Java;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members;

    public LibraryManager() {
        this.members = new ArrayList<>();
        initializeMembers();
    }
}
