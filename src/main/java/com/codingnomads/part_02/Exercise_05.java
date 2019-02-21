package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 * <p>
 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 * Use a "nested-if" statement;
 */
public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();

        if (userNum == 1) {
            System.out.println("ONE");
        } else if (userNum == 2) {
            System.out.println("TWO");
        } else if (userNum == 3) {
            System.out.println("THREE");
        } else if (userNum == 4) {
            System.out.println("FOUR");
        } else if (userNum == 5) {
            System.out.println("FIVE");
        } else if (userNum == 6) {
            System.out.println("SIX");
        } else if (userNum == 7) {
            System.out.println("SEVEN");
        } else if (userNum == 8) {
            System.out.println("EIGHT");
        } else if (userNum == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }

    }

}

