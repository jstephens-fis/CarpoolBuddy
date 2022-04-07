package com.example.carpoolbuddy.Models;

import com.example.carpoolbuddy.User;

public class Student extends User {
    public Student() {
        super();
    }
    public Student(String inUid, String inName, String inEmail) {
        super(inUid, inName, inEmail);
        this.setUserType("Student");
    }
}
