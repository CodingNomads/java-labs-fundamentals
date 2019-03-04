package com.codingnomads.part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

//todo do I have to set again in get


class OverloadConstructorEx{

    public static void main(String[] args) {
        Constructors example = new Constructors(10);
        Constructors exampleTwo = new Constructors(10,15);
        Constructors exampleThree = new Constructors(10,15,"val");

        System.out.println("x is " + example.getX());
        System.out.println(" x is " + exampleTwo.getX() + "; y is " + exampleTwo.getY());
        System.out.println("x is " + exampleThree.getX() + "; y is " + exampleThree.getY() + "; val is " + exampleThree.getVal());

        System.out.println();

        example.setX(200);
        exampleTwo.setY(200);
        exampleTwo.setX(250);
        exampleThree.setX(200);
        exampleThree.setY(250);
        exampleThree.setVal("val2");

        System.out.println("x is " + example.getX());
        System.out.println("x is " + exampleTwo.getX() + "; y is " + exampleTwo.getY());
        System.out.println("x is " + exampleThree.getX() + "; y is " + exampleThree.getY() + "; val is " + exampleThree.getVal());


    }



}


class Constructors{

    private int x;
    private int y;
    private String val;

    Constructors(int x){
        this.x = x;
    }

    Constructors(int x, int y){
        this.x = x;
        this.y = y;
    }

    Constructors(int x, int y, String val){
        this.x = x;
        this.y = y;
        this.val = val;
    }


    //use command N as the shortcut to autoconstruct getter and setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}