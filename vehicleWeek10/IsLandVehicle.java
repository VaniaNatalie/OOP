package com.company.vehicleWeek10;

public interface IsLandVehicle extends IsVehicle {
    int getNumWheels();
    void setNumWheels(int wheels);
    void drive();
}