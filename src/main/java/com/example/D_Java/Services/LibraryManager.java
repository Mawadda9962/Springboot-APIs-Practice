package com.example.D_Java.Services;

import com.example.D_Java.Entities.LibraryMember;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members;

    public LibraryManager() {
        this.members = new ArrayList<>();
        initializeMembers();
    }


    public void initializeMembers() {
        addMember(new LibraryMember(101, "Ahmed", "Standard"));
        addMember(new LibraryMember(102, "Sara", "Premium"));
        addMember(new LibraryMember(103, "John", "Standard"));
    }

    public void addMember(LibraryMember member){
        this.members.add(member);
    }

    public void displayMembers(){
        if (members.isEmpty()){
            System.out.println("There is no members");
        }else {
            for (LibraryMember member : members){
                System.out.println("ID: " + member.getMemberId() + "Name: "
                + member.getFullName() + "Type: " + member.getMembershipType());
            }
        }
    }

    public boolean deleteMemberById(Integer memberId) {
        for (int i = 0; i < members.size(); i++) {
            LibraryMember currentMember = members.get(i);

            if (currentMember.getMemberId().equals(memberId)) {
                members.remove(i);
                i--;
                System.out.println("Member found and deleted");
                return true;
            }
        }
        System.out.println("Member not found! ");
        return false;
    }
}
