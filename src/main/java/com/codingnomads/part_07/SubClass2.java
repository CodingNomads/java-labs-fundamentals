package com.codingnomads.part_07;

public class SubClass2 extends SubClass1 {

    // instance variables of the subclass
    private double aSC2;
    private double bSC2;
    private double cSC2;

    // Constructor


    public SubClass2(double x, double y, double z, double aSC1, double bSC2, double cSC3, double aSC2, double bSC21, double cSC2) {
        super(x, y, z, aSC1, bSC2, cSC3);
        this.aSC2 = aSC2;
        this.bSC2 = bSC21;
        this.cSC2 = cSC2;
    }

    // Methods
    public void add() {}
    public void subtract() {}
    public void multiplication() {}
    public void division() {}
}
