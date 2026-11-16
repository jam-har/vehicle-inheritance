package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hovercraft coolGadget = new Hovercraft("waterboy", "lime green", 100, 8, 200);

        coolGadget.setAirCushionPressure(15);

        coolGadget.hover();


    }
}
