package com.example.carpoolbuddy.Models;

public class ElectricCar extends Vehicle {

    public ElectricCar() {
        super();
    }

    public ElectricCar(String owner, String model, int cap, String id) {
        super(owner, model, cap, id);
        this.setVehicleType("ElectricCar");
        this.setBasePrice(650);
    }

    public ElectricCar(String owner, String model, int cap, String id, double price) {
        super(owner, model, cap, id, price);
        this.setVehicleType("ElectricCar");
    }
}
