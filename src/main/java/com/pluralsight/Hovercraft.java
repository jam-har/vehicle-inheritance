package com.pluralsight;

public class Hovercraft extends Vehicle {
    private int airCushionPressure;

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public Hovercraft(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity);
    }

    public void hover() {
        if (airCushionPressure >= 10) {
            accelerate();
            System.out.println("Your are riding!");
        }
    }
}
