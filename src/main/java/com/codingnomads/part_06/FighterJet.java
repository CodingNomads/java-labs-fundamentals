package com.codingnomads.part_06;

public class FighterJet extends FlyingVehicle {
    private int numberOfPilot;
    private int numberOfBombs;

    public FighterJet(int numberOfengine, int lengthOfwing, int lengthOftail, int numberOfPilot, int numberOfBombs) {
        super(numberOfengine, lengthOfwing, lengthOftail);
        this.numberOfPilot = numberOfPilot;
        this.numberOfBombs = numberOfBombs;
    }

    public int getNumberOfPilot() {
        return numberOfPilot;
    }

    public void setNumberOfPilot(int numberOfPilot) {
        this.numberOfPilot = numberOfPilot;
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public void setNumberOfBombs(int numberOfBombs) {
        this.numberOfBombs = numberOfBombs;
    }

    @Override
    public void landing(){
        System.out.println("Fighter Jet Landing");
    }

    @Override
    public String toString() {
        return "FighterJet { " + "Number Of Engine = " + getNumberOfEngine() +
                " Wing Length = " + getWingLength() +
                " Tail Length = " + getTailLength() +
                " Number Of Pilot = " + numberOfPilot +
                ", NumberOfBombs = " + numberOfBombs +
                '}';
    }
}
