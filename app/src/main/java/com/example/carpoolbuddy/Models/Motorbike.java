package com.example.carpoolbuddy.Models;

public class Motorbike extends Vehicle {
    public Motorbike() {
        super();
    }

    public Motorbike(String owner, String model, int cap, String id) {
        super(owner, model, 2, id);
        this.setVehicleType("Motorbike");
        this.setBasePrice(200);
    }

    public Motorbike(String owner, String model, int cap, String id, double price) {
        super(owner, model, 2, id, price);
        this.setVehicleType("Motorbike");
        this.setBasePrice(200);
    }
}