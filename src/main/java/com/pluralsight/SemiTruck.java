package com.pluralsight;

public class SemiTruck extends Vehicle {

    private int numberOfTrailers;

    public SemiTruck(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity);
    }

    public void loadCargo() {
        System.out.println("You have cargo in " + numberOfTrailers + " trailers!");
    }
    public void unloadCargo() {
        System.out.println("You have emptied the cargo in " + numberOfTrailers + " trailers!");
    }

}
