package com.codingnomads.part_07;

public class SuperClass implements MyInterface {

    // Instance variables
    private double x;
    private double y;
    private double z;

    // Constructors


    public SuperClass() {
    }

    public SuperClass(double x) {
        this.x = x;
    }

    public SuperClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public SuperClass(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Setters

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }


    // Implementing interface


    public void add() {
        double sum = 0;
        sum = x + y + z;
        System.out.println(sum);

    }

    public void subtract() {
        double sum = 0;
        sum = x - y - z;
        System.out.println(sum);
    }

    public void multiplication() {
        double sum = 0;
        sum = x * y * z;
        System.out.println(sum);
    }
}

class Controller {
    public static void main(String[] args) {
        SuperClass objSupClass = new SuperClass(10, 20, 30);
        objSupClass.add();
        objSupClass.subtract();
        objSupClass.multiplication();


        SubClass1 objsc1 = new SubClass1();

        objsc1.setX(10);
        objsc1.setY(10);
        objsc1.setZ(10);

        SubClass2 objsc2 = new SubClass2(10,10,10,10,10,10,10,10,10);

        objsc2.setaSC1(20);
        objsc2.setbSC2(20);
        objsc2.setcSC3(20);

    }
}

