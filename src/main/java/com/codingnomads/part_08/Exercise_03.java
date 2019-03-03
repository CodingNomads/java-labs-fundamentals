package com.codingnomads.part_08;

public class Exercise_03 {

    public static void main(String[] args) {
        try {
            ClassB.divide(10, 0);
        } catch (ArithmeticException exc){
            System.out.println("Exception caught!");
        }
    }
}

class ClassB {

    public static int divide(int x, int y){
        try {
            return x / y;
        }catch(ArithmeticException err){
            System.out.println("Exception rethrown.");
            throw err;
        }
    }

}
