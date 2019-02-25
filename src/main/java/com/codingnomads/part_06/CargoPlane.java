package com.codingnomads.part_06;

public class CargoPlane extends PassangerPlane {
    private boolean frontLoading;

    public CargoPlane(int numberOfengine, int lengthOfwing, int tailLength,
                      int numberOfPassangers, int cargoCapacity, boolean frontLoading) {

        super(numberOfengine, lengthOfwing, tailLength, numberOfPassangers, cargoCapacity);
        this.frontLoading = frontLoading;
    }

    public CargoPlane(int numberOfEngine, int wingLength, int tailLength, int fuel, int numberOfPassangers,
                      int cargoCapacity, boolean frontLoading) {

        super(numberOfEngine, wingLength, tailLength, fuel, numberOfPassangers, cargoCapacity);
        this.frontLoading = frontLoading;
    }

    public boolean isFrontLoading() {
        return frontLoading;
    }

    public void setFrontLoading(boolean frontLoading) {
        this.frontLoading = frontLoading;
    }

    @Override
    public void landing(){
        if(showFuel() >= 10000){
            System.out.println("Cargo Can Not Land With That Amount Of Fuel");
            return;
        }

        System.out.println("Cargo Plane Landing");
    }

    @Override
    public String toString() {
        return "CargoPlane { " + "Number Of Engine = " + getNumberOfEngine() +
                " Wing Length = " + getWingLength() +
                " Tail Length = " + getTailLength() +
                ", Cargo Capacity = " + getCargoCapacity() + " " + " Front Loading = " + frontLoading +
                '}';
    }
}
