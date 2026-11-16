package com.pluralsight;

public class SemiTruck extends Vehicle {

    private int numberOfTrailers;

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo() {
        System.out.println("You have cargo in " + numberOfTrailers + " trailers!");
    }
    public void unloadCargo() {
        System.out.println("You have emptied the cargo in " + numberOfTrailers + " trailers!");
    }

}
