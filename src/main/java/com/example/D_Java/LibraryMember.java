package com.example.D_Java;

public class LibraryMember {
    private Integer memberId;
    private String fullName;
    private String membershipType;

    public LibraryMember(Integer memberId, String fullName, String membershipType) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.membershipType = membershipType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}
