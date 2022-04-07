package com.example.carpoolbuddy.Models;

import com.example.carpoolbuddy.User;

public class Parent extends User {
    public Parent() {
        super();
    }
    public Parent(String inUid, String inName, String inEmail) {
        super(inUid, inName, inEmail);
        this.setUserType("Parent");
    }
}
