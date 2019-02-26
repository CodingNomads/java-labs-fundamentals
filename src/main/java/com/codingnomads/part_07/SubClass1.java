package com.codingnomads.part_07;

public class SubClass1 extends SuperClass {

    // instance variables of the sub-class
    private double aSC1;
    private double bSC2;
    private double cSC3;

    // Constructors


    public SubClass1() {
    }

    public SubClass1(double x, double y, double z, double aSC1, double bSC2, double cSC3) {
        super(x, y, z);
        this.aSC1 = aSC1;
        this.bSC2 = bSC2;
        this.cSC3 = cSC3;
    }

    // Setters

    public void setaSC1(double aSC1) {
        this.aSC1 = aSC1;
    }

    public void setbSC2(double bSC2) {
        this.bSC2 = bSC2;
    }

    public void setcSC3(double cSC3) {
        this.cSC3 = cSC3;
    }

    // Methods
    public void add() {}
    public void subtract() {}
    public void multiplication() {};
    public void division() {};

}
