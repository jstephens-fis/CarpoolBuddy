package com.example.carpoolbuddy.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Vehicle implements Serializable {
    private String owner;
    private String model;
    private int capacity;
    private String vehicleId;
    private ArrayList<String> reservedUids;
    private boolean open;
    private String vehicleType;
    private double basePrice; // unlike User (where price multiplier can only be set internally), base price can be changed

    public Vehicle() {
    }

    public Vehicle(String inOwner, String inModel, int inCap, String inId) {
        owner = inOwner;
        model = inModel;
        capacity = inCap;
        vehicleId = inId;
        reservedUids = new ArrayList<>();
        open = true;
        vehicleType = "";
        basePrice = 1000;
    }

    public Vehicle(String inOwner, String inModel, int inCap, String inId, double inPrice) {
        owner = inOwner;
        model = inModel;
        capacity = inCap;
        vehicleId = inId;
        reservedUids = new ArrayList<>();
        open = true;
        vehicleType = "";
        basePrice = inPrice;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public ArrayList<String> getReservedUids() {
        return reservedUids;
    }

    public void addReservedUid(String inUid) {
        this.reservedUids.add(inUid);
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // is protected so only children classes (Car, ElectricCar, Motorbike) can set the vehicle Type
    protected void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // base price can be changed outside of parent + children classes because each car's model can have a different base price
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
