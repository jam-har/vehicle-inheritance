package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hovercraft coolGadget = new Hovercraft();
        coolGadget.setAirCushionPressure(15);
        coolGadget.hover();

        SemiTruck semi = new SemiTruck();
        semi.setNumberOfTrailers(2);
        semi.loadCargo();
        semi.unloadCargo();


    }
}
