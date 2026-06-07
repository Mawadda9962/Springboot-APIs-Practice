package com.example.D_Java.Services;

import com.example.D_Java.Entities.libraryMember;

import java.util.ArrayList;

public class libraryManager {
    private ArrayList<libraryMember> members;

    public libraryManager() {
        this.members = new ArrayList<>();
        initializeMembers();
    }


    public void initializeMembers() {
        addMember(new libraryMember(101, "Ahmed", "Standard"));
        addMember(new libraryMember(102, "Sara", "Premium"));
        addMember(new libraryMember(103, "John", "Standard"));
    }

    public void addMember(libraryMember member){
        this.members.add(member);
    }

    public void displayMembers(){
        if (members.isEmpty()){
            System.out.println("There is no members");
        }else {
            for (libraryMember member : members){
                System.out.println("ID: " + member.getMemberId() + "Name: "
                + member.getFullName() + "Type: " + member.getMembershipType());
            }
        }
    }

    public boolean deleteMemberById(Integer memberId) {
        for (int i = 0; i < members.size(); i++) {
            libraryMember currentMember = members.get(i);

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
