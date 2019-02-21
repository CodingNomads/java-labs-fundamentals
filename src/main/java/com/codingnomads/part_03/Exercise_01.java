package com.codingnomads.part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class ControllerExercise01{
    public static void main(String[] args) {

        Electronic television = new Electronic();
        television.setHasScreen(true);
        television.setHasBattery(false);
        television.setRecyclable(false);
        television.setCost(499);

        System.out.println(television.toString());

        Cellphone iPhone = new Cellphone();
        iPhone.setProcessorSpeed(1.89);
        iPhone.setStorageCapacity(64);
        iPhone.setTouchScreen(true);
        iPhone.setVolumeLevel(9);

        System.out.println(iPhone.toString());


    }
}

class Electronic {

    private boolean hasScreen;
    private boolean hasBattery;
    private double cost;
    private boolean recyclable;

    public boolean isHasScreen() {
        return hasScreen;
    }

    public void setHasScreen(boolean hasScreen) {
        this.hasScreen = hasScreen;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "hasScreen=" + hasScreen +
                ", hasBattery=" + hasBattery +
                ", cost=" + cost +
                ", recyclable=" + recyclable +
                '}';
    }
}

class Cellphone extends Electronic {

    private boolean touchScreen;
    private int volumeLevel;
    private int storageCapacity;
    private double processorSpeed;

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "touchScreen=" + touchScreen +
                ", volumeLevel=" + volumeLevel +
                ", storageCapacity=" + storageCapacity +
                ", processorSpeed=" + processorSpeed +
                '}';
    }
}
