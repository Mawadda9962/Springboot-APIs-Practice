package com.example.D_Java.Entities;

public class libraryMember {
    private Integer memberId;
    private String fullName;
    private String membershipType;

    public libraryMember(Integer memberId, String fullName, String membershipType) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.membershipType = membershipType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMembershipType() {
        return membershipType;
    }
}
