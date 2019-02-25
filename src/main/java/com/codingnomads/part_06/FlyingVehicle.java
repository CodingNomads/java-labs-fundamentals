package com.codingnomads.part_06;

public class FlyingVehicle {
    private int numberOfEngine;
    private int wingLength;
    private int tailLength;
    private int fuel;

    public FlyingVehicle(int numberOfengine, int lengthOfwing, int tailLength) {
        this.numberOfEngine = numberOfengine;
        this.wingLength = lengthOfwing;
        this.tailLength = tailLength;
    }

    public FlyingVehicle(int numberOfEngine, int wingLength, int tailLength, int fuel) {
        this.numberOfEngine = numberOfEngine;
        this.wingLength = wingLength;
        this.tailLength = tailLength;
        this.fuel = fuel;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public void setNumberOfEngine(int numberOfEngine) {
        this.numberOfEngine = numberOfEngine;
    }

    public int getWingLength() {
        return wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public void fuelUp(int fuel){

        this.fuel = fuel;
    }

    public int showFuel(){
        return fuel;
    }

    public void landing(){
        System.out.println("Landing");
    }

}
