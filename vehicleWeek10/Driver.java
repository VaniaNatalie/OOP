package com.company.vehicleWeek10;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Object> vehicles = new ArrayList<>();
        Jeep j = new Jeep(4, "JEEP 1", 4, 80);
        vehicles.add(j);

        Hovercraft h = new Hovercraft(4, "HOVERCRAFT 1", 500, 50, 200);
        vehicles.add(h);

        Frigate f = new Frigate(500, "FRIGATE 1", 150, 60);
        vehicles.add(f);

        PoliceCar pc = new PoliceCar(4, "POLICE CAR 1", 4, 120, 200);
        vehicles.add(pc);
    }
}