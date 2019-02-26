package com.codingnomads.part_08;

public class ExceptionHandle {
    public static void main(String[] args) {

        int val1 = 5;
        int val2 = 0;
        int result;


        try{
            result = val1 / val2;
        }
        catch(ArithmeticException ae){
            System.out.println("Exception Catched.");
        }

        System.out.println("After Catch");
    }
}
