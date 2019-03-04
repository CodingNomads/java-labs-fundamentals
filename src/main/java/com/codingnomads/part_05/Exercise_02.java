package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you ust manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 */

class Class_01{

    public static void main(String[] args) {

        Class_02 example = new Class_02();
        example.displayXY();

        Class_01 method = new Class_01();
        method.displayVal(20, 30);

    }

    public void displayVal(int x, int y){
        x = 15;
        y = 20;
        System.out.println("x: " + x + "; y: " + y);
    }


}

class Class_02{
    private int x = 10;
    private int y = 8;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void displayXY(){
        System.out.println("x: " + x + "; y: " + y);
    }
}

