package com.example.carpoolbuddy.Models;

public class Car extends Vehicle {

    public Car() {
        super();
    }

    public Car(String owner, String model, int cap, String id) {
        super(owner, model, cap, id);
        this.setVehicleType("Car");
        this.setBasePrice(700);
    }

    public Car(String owner, String model, int cap, String id, double price) {
        super(owner, model, cap, id, price);
        this.setVehicleType("Car");
    }
}
