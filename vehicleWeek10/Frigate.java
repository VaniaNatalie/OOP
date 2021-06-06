package com.company.vehicleWeek10;

public class Frigate implements IsSeaVessel {
    private int displacement;
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Frigate(){};

    public Frigate(int displacement, String name, int maxPassengers, int maxSpeed) {
        this.displacement = displacement;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Launching Frigate");
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
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = speed;
    }

    public void fireGun() {
        System.out.println("PEW PEW");
    }
}
