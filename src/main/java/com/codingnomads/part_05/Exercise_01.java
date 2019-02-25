package com.codingnomads.part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class Universe{
    public static void main(String[] args) {
        Sun earth = new Sun();
        //set variables in class sun
         earth.setColor("burningYellow");
         earth.setDiameter(1000);
         earth.setStatus(true);

        System.out.println("sun: \n" + earth.color + "\n"+earth.diameter + "\n"+earth.status + " which means, she is shining");
        System.out.println();

        earth.setBlueEarthMoon(1000, "bluewhite", true );


    }
}

class Sun{
    int diameter;
    String color;
    boolean status;


    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;

    }


    public void setBlueEarthMoon(int diameter, String color, boolean status){

        //instance of moon set moon variables
        Moon blueEarth = new Moon();

        blueEarth.setColor(color);
        blueEarth.setStatus(status);
        blueEarth.setDiameter(diameter);

        System.out.println("moon: \n" + blueEarth.color);
    }

}

class Moon{
    int diameter;
    String color;
    boolean status;


    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }
}