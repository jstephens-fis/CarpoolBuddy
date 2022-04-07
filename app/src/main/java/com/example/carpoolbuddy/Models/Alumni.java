package com.example.carpoolbuddy.Models;

import com.example.carpoolbuddy.User;

public class Alumni extends User {
    public Alumni() {
        super();
    }
    public Alumni(String inUid, String inName, String inEmail) {
        super(inUid, inName, inEmail);
        this.setUserType("Alumni");
    }
}
