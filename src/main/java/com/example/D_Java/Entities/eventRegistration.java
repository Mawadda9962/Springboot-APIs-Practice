package com.example.D_Java.Entities;

public class eventRegistration {

    private int registrationId;
    private String attendeeName;

    public eventRegistration(int registrationId, String attendeeName) {
        this.registrationId = registrationId;
        this.attendeeName = attendeeName;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }
}
