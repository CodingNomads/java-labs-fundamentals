package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 have a main method that creates an instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


//You must overload a method a least 3 times.


class Controller2 {
    public static void main(String[] args) {

        Choclates suchard = new Choclates();


        System.out.println("bought choclates: " + suchard.theTruth(50));


        System.out.println("kind: " + suchard.theTruth("Pralines", "Suchard"));


        System.out.println("left ones: " + suchard.theTruth(50, 49));
    }

}

class Choclates {

    private int number;
    private int eaten;
    private String name;
    private String kindOf;

    public int theTruth(int number) {
        return number;
    }

    public String theTruth(String kindOf, String name) {
        return name + " " + kindOf;
    }


    public int theTruth(int number, int eaten) {
        return number - eaten;
    }

   /* @Override
    public String toString(){
        return "Choclates {number: " + number + ", eaten: " + eaten + ", brandName: " + name + ", kindOf: " + kindOf + "}";
    } müsste setters methoden verwenden.. */
}
