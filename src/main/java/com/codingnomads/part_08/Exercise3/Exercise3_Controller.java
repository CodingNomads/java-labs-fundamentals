package com.codingnomads.part_08.Exercise3;

public class Exercise3_Controller {
    public static void main(String[] args) {
        Car toyota = new Car();
        try {
            toyota.run();
        } catch (ArithmeticException exc) {
            System.out.println("You cannot divide this car by zero!!!!");
        }
    }
}
