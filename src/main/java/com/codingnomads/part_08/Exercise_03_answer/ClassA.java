package com.codingnomads.part_08.Exercise_03_answer;

public class ClassA {

    public static void main(String[] args) {

        ClassB division = new ClassB();
        try{
            division.calc(10,0);
        } catch ( ArithmeticException exc){
            System.out.println("Class A caught the arithmetic exception!");
        }


    }
}
