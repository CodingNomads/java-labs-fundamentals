package com.codingnomads.part_06;

public class PassangerPlane extends FlyingVehicle {
    private int numberOfPassangers;
    private int cargoCapacity;

    public PassangerPlane(int numberOfengine, int lengthOfwing, int lengthOftail, int numberOfPassangers, int cargoCapacity) {
        super(numberOfengine, lengthOfwing, lengthOftail);
        this.numberOfPassangers = numberOfPassangers;
        this.cargoCapacity = cargoCapacity;
    }

    public PassangerPlane(int numberOfEngine, int wingLength, int tailLength, int numberOfPassangers, int cargoCapacity , int fuel) {
        super(numberOfEngine, wingLength, tailLength, fuel);
        this.numberOfPassangers = numberOfPassangers;
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void landing(){
        if(showFuel() >= 5000){
            System.out.println("Passanger Plane Can Not Land With That Amount Of Fuel");
            return;
        }

        System.out.println("Passanger Plane Landing");
    }

    @Override
    public String toString() {
        return "PassangerPlane { " + "Number Of Engine = " + getNumberOfEngine() +
                " Wing Length = " + getWingLength() +
                " Tail Length = " + getTailLength() +
                " NumberOfPassangers = " + numberOfPassangers +
                ", Cargo Capacity = " + cargoCapacity + " " +
                '}' ;
    }
}
