package com.pluralsight;

public class Hovercraft extends Vehicle {
    private int airCushionPressure;

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        if (airCushionPressure >= 10) {
            accelerate();
            System.out.println("Your are riding!");
        }
    }
}
