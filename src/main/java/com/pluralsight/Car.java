package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk() {
        System.out.println("The trunk is open!");
    }
    public void closeTrunk() {
        System.out.println("The trunk is closed!");
    }

}
