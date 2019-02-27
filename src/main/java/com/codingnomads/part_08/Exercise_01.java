package com.codingnomads.part_08;


//Write a class with at least one method that uses a try/catch statement. Make sure the catch block is executed, ie
//generate an error an catch it in the catch block.

public class Exercise_01 {

    public static void main(String[] args) {
        int[] intArray = new int[10];

        try{
            intArray[11] = 2;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Index is out of bounds!");
        }
    }
}
