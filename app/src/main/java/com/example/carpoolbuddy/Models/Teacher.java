package com.example.carpoolbuddy.Models;

import com.example.carpoolbuddy.User;

public class Teacher extends User {
    public Teacher() {
        super();
    }
    public Teacher(String inUid, String inName, String inEmail) {
        super(inUid, inName, inEmail);
        this.setUserType("Teacher");
    }
}
