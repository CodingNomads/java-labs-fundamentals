package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */


class Garage3 {
    public static void main(String[] args) {

        FormulaOneCar3 mercedes = new FormulaOneCar3("Mercedes-Benz AMG Petronas","V6 Hybrid Turbo");
        FormulaOneCar3 williams = new FormulaOneCar3("Williams F1", "Renault RSG V10",3.5,830);
        FormulaOneCar3 lotus = new FormulaOneCar3("Lotus 25","Coventry Climax FWMV",1.496,250,"Jim Clark","Peter Arundell");

        System.out.println("CURRENT STATUS: " + "\n" + mercedes.getManufacturer() + "\n" + mercedes.getEngineType() + "\n" + mercedes.getEngineCapacityLitres() + "\n" + mercedes.getHorsePower() + "\n" + mercedes.getDriver1Name() + "\n" + mercedes.getDriver2Name() + "\n\n");
        mercedes.changeCar(mercedes,"Scuderia Ferrari F2004", "V10",3.0,900,"Michael Schumacher","Rubens Barrichello");
        System.out.println("NEW STATUS: " + "\n" + mercedes.getManufacturer() + "\n" + mercedes.getEngineType() + "\n" + mercedes.getEngineCapacityLitres() + "\n" + mercedes.getHorsePower() + "\n" + mercedes.getDriver1Name() + "\n" + mercedes.getDriver2Name() + "\n\n");

        System.out.println("CURRENT STATUS: " + "\n" + williams.getManufacturer() + "\n" + williams.getEngineType() + "\n" + williams.getEngineCapacityLitres() + "\n" + williams.getHorsePower() + "\n" + williams.getDriver1Name() + "\n" + williams.getDriver2Name() + "\n\n");
        williams.changeCar(williams,"Williams FW17", "Renault RSG V10",3.0,910,"Damon Hill","David Coulthhard");
        System.out.println("New STATUS: " + "\n" + williams.getManufacturer() + "\n" + williams.getEngineType() + "\n" + williams.getEngineCapacityLitres() + "\n" + williams.getHorsePower() + "\n" + williams.getDriver1Name() + "\n" + williams.getDriver2Name() + "\n\n");

        System.out.println("CURRENT STATUS: " + "\n" + lotus.getManufacturer() + "\n" + lotus.getEngineType() + "\n" + lotus.getEngineCapacityLitres() + "\n" + lotus.getHorsePower() + "\n" + lotus.getDriver1Name() + "\n" + lotus.getDriver2Name() + "\n\n");
        lotus.changeCar(lotus,"Lotus 43", "BRM H16",2.996,275,"Jim Clark","Graham Hill");
        System.out.println("New STATUS: " + "\n" + lotus.getManufacturer() + "\n" + lotus.getEngineType() + "\n" + lotus.getEngineCapacityLitres() + "\n" + lotus.getHorsePower() + "\n" + lotus.getDriver1Name() + "\n" + lotus.getDriver2Name() + "\n\n");

    }
}

class FormulaOneCar3 {

    private String manufacturer;
    private String engineType;
    private double engineCapacityLitres;
    private double horsePower;
    private String driver1Name;
    private String driver2Name;

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

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEngineCapacityLitres(double engineCapacityLitres) {
        this.engineCapacityLitres = engineCapacityLitres;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public void setDriver1Name(String driver1Name) {
        this.driver1Name = driver1Name;
    }

    public void setDriver2Name(String driver2Name) {
        this.driver2Name = driver2Name;
    }

    public FormulaOneCar3(String manufacturer, String engineType) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
    }

    public FormulaOneCar3(String manufacturer, String engineType, double engineCapacityLitres, double horsePower) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.engineCapacityLitres = engineCapacityLitres;
        this.horsePower = horsePower;
    }

    public FormulaOneCar3(String manufacturer, String engineType, double engineCapacityLitres, double horsePower, String driver1Name, String driver2Name) {
        this.manufacturer = manufacturer;
        this.engineType = engineType;
        this.engineCapacityLitres = engineCapacityLitres;
        this.horsePower = horsePower;
        this.driver1Name = driver1Name;
        this.driver2Name = driver2Name;
    }

    public void changeCar(FormulaOneCar3 car, String manufacturer, String engineType, double engineCapacityLitres, double horsePower, String driver1Name, String driver2Name) {
        car.setManufacturer(manufacturer);
        car.setEngineType(engineType);
        car.setEngineCapacityLitres(engineCapacityLitres);
        car.setHorsePower(horsePower);
        car.setDriver1Name(driver1Name);
        car.setDriver2Name(driver2Name);

    }
}

