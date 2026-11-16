package com.pluralsight;

public class Moped extends Vehicle {
    private int maxWeight;

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride() {
        startEngine();
        accelerate();
        System.out.println("You are riding! Please ride with only " + (getNumberOfPassengers() - 1));
    }

}
