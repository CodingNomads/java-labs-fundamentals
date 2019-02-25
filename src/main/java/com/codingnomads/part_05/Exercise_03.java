package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class OverloadSample{
    public static void main(String[] args) {

        System.out.println(MathUtil.multiply(20,30));
        System.out.println(MathUtil.multiply(23.1231231,41.2353));
        System.out.println(MathUtil.multiply(20L,30L));
    }
}

class MathUtil{
    public static int multiply(int val1, int val2){
        return val1 * val2;
    }

    public static double multiply(double val1, double val2){
        return val1 * val2;
    }

    public static long multiply(long val1, long val2){
        return val1 * val2;
    }
}