package com.codingnomads.part_05;

import java.util.Scanner;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */

class Garage {

    static void upgradeEngine(FormulaOneCar car) {
        car.upgradeEngineCapacity();
        car.upgradeHorsePower();
        changeDrivers(car);
    }

    static void downgradeEngine(FormulaOneCar car) {
        car.downupgradeEngineCapacity();
        car.downgradeHorsePower();
    }

    static void changeDrivers(FormulaOneCar car) {
        boolean trigger = false;
        Scanner input = new Scanner(System.in);
        Scanner driverNameChanger1 = new Scanner(System.in);
        Scanner driverNameChanger2 = new Scanner(System.in);
        System.out.println("Would you like to change drivers for the new season? Enter Yes or No.");
        while (!trigger) {
            String userInput = input.nextLine();
            if (userInput.equals("Yes")) {
                trigger = true;
            } else if (userInput.equals("No")) {
                System.out.println("Drivers not changed!");
                break;
            } else {
                System.out.println("Sorry I didn't understand");
            }
        }
        if (trigger) {
            System.out.println("Enter the name of your new driver 1: ");
            car.setDriver1Name(driverNameChanger1.nextLine());
            System.out.println("Enter the name of your new driver 2: ");
            car.setDriver2Name(driverNameChanger2.nextLine());
            System.out.println("\n" + "Drivers changed!");
        }

    }


    public static void main(String[] args) {

        FormulaOneCar mercedes = new FormulaOneCar("Mercedes-Benz AMG Petronas", "V6 Hybrid Turbo", 1.6, 1000, "Lewis Hamilton", "Valteri Bottas");
        FormulaOneCar ferrari = new FormulaOneCar("Scuderia Ferrari", "V6 Hybrid Turbo", 1.6, 980, "Sebastian Vettel", "Kimi Raikkonen");
        FormulaOneCar redbull = new FormulaOneCar("Aston Martin Red Bull Racing", "V6 Hybrid Turbo", 1.6, 950, "Daniel Riccardio", "Max Verstappen");

        System.out.println("Current engine capacity is: " + mercedes.getEngineCapacityLitres() + "L" + "\n" + "Current horsepower is: " + mercedes.getHorsePower() + "HP" + "\n" + "Driver 1 name is: " + mercedes.getDriver1Name() + "\n" + "Driver 2 name is: " + mercedes.getDriver2Name() + "\n");
        upgradeEngine(mercedes);
        System.out.println("New engine capacity is: " + mercedes.getEngineCapacityLitres() + "L" + "\n" + "Current horsepower is: " + mercedes.getHorsePower() + "HP" + "\n" + "Driver 1 name is: " + mercedes.getDriver1Name() + "\n" + "Driver 2 name is: " + mercedes.getDriver2Name() + "\n");;
        downgradeEngine(mercedes);
        System.out.println("New engine capacity is: " + mercedes.getEngineCapacityLitres() + "L" + "\n" + "Current horsepower is: " + mercedes.getHorsePower() + "HP" + "\n" + "Driver 1 name is: " + mercedes.getDriver1Name() + "\n" + "Driver 2 name is: " + mercedes.getDriver2Name() + "\n");;

    }

}

class FormulaOneCar {

    private String manufacturer;
    private String engineType;
    private double engineCapacityLitres;
    private double horsePower;
    private String driver1Name;
    private String driver2Name;

    public String getDriver1Name() {
        return driver1Name;
    }

    public String getDriver2Name() {
        return driver2Name;
    }

    public void setDriver1Name(String driver1Name) {
        this.driver1Name = driver1Name;
    }

    public void setDriver2Name(String driver2Name) {
        this.driver2Name = driver2Name;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void upgradeHorsePower() {
        this.horsePower += 5;
    }

    public void downgradeHorsePower() {
        this.horsePower -= 5;
    }

    public double getEngineCapacityLitres() {
        return engineCapacityLitres;
    }

    public void upgradeEngineCapacity() {
        this.engineCapacityLitres += 0.05;
    }

    public void downupgradeEngineCapacity() {
        this.engineCapacityLitres -= 0.05;
    }

    public FormulaOneCar(String manufacturer, String engineType, double engineCapacity, int horsePower, String driver1Name, String driver2Name) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.engineCapacityLitres = engineCapacity;
        this.horsePower = horsePower;
        this.driver1Name = driver1Name;
        this.driver2Name = driver2Name;


    }
}