package com.company.vehicleWeek10;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Jeep implements IsLandVehicle {
    private int numWheels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Jeep(){};

    public Jeep(int numWheels, String name, int maxPassengers, int maxSpeed) {
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int wheels) {
        this.numWheels = wheels;
    }

    @Override
    public void drive() {
        System.out.println("Driving Jeep");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int pass) {
        this.maxPassengers = pass;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public void soundHorn() {
        System.out.println("Honk");
    }
}
