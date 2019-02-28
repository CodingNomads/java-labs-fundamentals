package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Garage2 {
    public static void main(String[] args) {

        FormulaOneCar2 ferrari = new FormulaOneCar2("Scuderia Ferrari", "V6 Hybrid Turbo", 1.6, 980, "Sebastian Vettel", "Kimi Raikkonen");

        System.out.println("Current Status:" + "\n" + ferrari.getManufacturer() + "\n" + ferrari.getEngineType() + "\n" + ferrari.getEngineCapacityLitres() + "L" + "\n" + ferrari.getHorsePower() + "\n" + ferrari.getDriver1Name() + "\n" + ferrari.getDriver2Name() + "\n");
        ferrari.changeCar(ferrari);
        System.out.println("New Status:" + "\n" + ferrari.getManufacturer() + "\n" + ferrari.getEngineType() + "\n" + ferrari.getEngineCapacityLitres() + "L" + "\n" + ferrari.getHorsePower() + "\n" + ferrari.getDriver1Name() + "\n" + ferrari.getDriver2Name() + "\n");
        ferrari.changeCar(ferrari.getManufacturer());
        System.out.println("New Status:" + "\n" + ferrari.getManufacturer() + "\n" + ferrari.getEngineType() + "\n" + ferrari.getEngineCapacityLitres() + "L" + "\n" + ferrari.getHorsePower() + "\n" + ferrari.getDriver1Name() + "\n" + ferrari.getDriver2Name() + "\n");
        ferrari.changeCar(ferrari.getEngineCapacityLitres(),ferrari.getHorsePower());
        System.out.println("New Status:" + "\n" + ferrari.getManufacturer() + "\n" + ferrari.getEngineType() + "\n" + ferrari.getEngineCapacityLitres() + "L" + "\n" + ferrari.getHorsePower() + "\n" + ferrari.getDriver1Name() + "\n" + ferrari.getDriver2Name() + "\n");

    }
}

class FormulaOneCar2 {

    private String manufacturer;
    private String engineType;
    private double engineCapacityLitres;
    private double horsePower;
    private String driver1Name;
    private String driver2Name;

    public FormulaOneCar2(String manufacturer, String engineType, double engineCapacityLitres, double horsePower, String driver1Name, String driver2Name) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.engineCapacityLitres = engineCapacityLitres;
        this.horsePower = horsePower;
        this.driver1Name = driver1Name;
        this.driver2Name = driver2Name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEngineCapacityLitres() {
        return engineCapacityLitres;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public String getDriver1Name() {
        return driver1Name;
    }

    public String getDriver2Name() {
        return driver2Name;
    }

    public String setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return manufacturer;
    }

    public String setEngineType(String engineType) {
        this.engineType = engineType;
        return engineType;
    }

    public double setEngineCapacityLitres(double engineCapacityLitres) {
        this.engineCapacityLitres = engineCapacityLitres;
        return engineCapacityLitres;
    }

    public double setHorsePower(double horsePower) {
        this.horsePower = horsePower;
        return horsePower;
    }

    public String setDriver1Name(String driver1Name) {
        this.driver1Name = driver1Name;
        return driver1Name;
    }

    public String setDriver2Name(String driver2Name) {
        this.driver2Name = driver2Name;
        return driver2Name;
    }

    public String[] changeCar(FormulaOneCar2 car) {
        String[] array = new String[2];
        array[0] = car.setDriver1Name("Jordan Shenolikar");
        array[1] = car.setDriver2Name("Aimee Bradshaw");
        return array;
    }

    public String changeCar(String manufacturer) {
        this.manufacturer = manufacturer;
        manufacturer = setManufacturer("Mercedes-Benz AMG Petronas");
        return manufacturer;
    }

    public Double[] changeCar(Double engineCapacityLitres, Double horsePower) {
        this.engineCapacityLitres = engineCapacityLitres;
        this.horsePower = horsePower;
        Double[] array = new Double[2];
        array[0] = setEngineCapacityLitres(2.0);
        array[1] = setHorsePower(850);
        return array;
    }

}
