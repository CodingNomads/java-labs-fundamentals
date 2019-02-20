package com.codingnomads.part_02;

import java.util.Scanner;
/**
 * Part 2 Exercise 6:
 * <p>
 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 * Use a "switch-case" statement.
 */

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a Number");
        int val = keyboard.nextInt();

        switch (val){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
                default:
                    System.out.println("OTHER");
        }
    }
}