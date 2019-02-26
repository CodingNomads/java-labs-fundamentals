package com.codingnomads.part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Controller {
    public static void main(String[] args) {

        System.out.println("Instantiating object...");

        Electronics myPhone = new Electronics();
        myPhone.setBrand("iPhone");
        myPhone.setOn(true);
        myPhone.setVoltage(110.0);

        System.out.println(myPhone.toString());

        System.out.println("Instantiating class 3 from class 2 and passing parameters from psvm...");
        myPhone.setTelevisionsVariables(51, "Samsung");

    }
}

class Electronics {

    private String brand;
    private double voltage;
    private boolean isOn;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", voltage=" + voltage +
                ", isOn=" + isOn +
                '}';
    }

    public void setTelevisionsVariables(int size, String tvBrand) {

        Televisions myTv = new Televisions();
        myTv.setSize(size);
        myTv.setTvBrand(tvBrand);

        System.out.println(myTv.toString());

    }

}


class Televisions {

    private int size;
    private String tvBrand;

    public void setSize(int size) {
        this.size = size;
    }

    public void setTvBrand(String tvBrand) {
        this.tvBrand = tvBrand;
    }

    @Override
    public String toString() {
        return "Televisions{" +
                "size=" + size +
                ", tvBrand='" + tvBrand + '\'' +
                '}';
    }
}