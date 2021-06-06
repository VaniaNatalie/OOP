package com.company.vehicleWeek10;

public class PoliceCar implements IsLandVehicle, IsEmergency {
    private int numWheels;
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int fuel;

    public PoliceCar(){};

    public PoliceCar(int numWheels, String name, int maxPassengers, int maxSpeed, int fuel) {
        this.numWheels = numWheels;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    @Override
    public String soundSiren() {
        return "WEE WOO WEE WOO";
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
        if (fuel > 0) {
            fuel -= 5;
        }
        System.out.println("Police car driving");
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
        return maxPassengers;
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

    public int checkFuel() {
        return fuel;
    }
}
