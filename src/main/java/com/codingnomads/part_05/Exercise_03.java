package com.codingnomads.part_05;

import java.lang.reflect.Method;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class MethodOverloadingEx {

    public static void main(String[] args) {
        MethodClass example = new MethodClass();
        example.calcVal(10);
        example.calcVal(10,20);
        example.calcVal(10,20,30);
    }


}

class MethodClass{

    public int calcVal(int x){
        System.out.println("x is " + x);
        return x;

    }

    public int calcVal(int x, int y){
        int result = x + y;
        System.out.println("result is " + result);
        return result;
    }

    public int calcVal(int x, int y, int z){
        int result = x * y * z;
        System.out.println("result is " + result);
        return result;
    }
}