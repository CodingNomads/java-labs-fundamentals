package com.codingnomads.part_08.Exercise_03_answer;

public class ClassB {

    int calc(int x, int y){
        try{
            return x / y;
        } catch (ArithmeticException exc){
            System.out.println("An arithmetic exception has occurred, and caught by Class B.");
            throw exc;
        }

    }

}
