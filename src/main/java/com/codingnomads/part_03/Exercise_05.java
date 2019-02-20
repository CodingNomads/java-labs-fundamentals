package com.codingnomads.part_03;

import java.util.Scanner;



public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
            Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a number between 1 and 999,999,999: ");

        int chosenNumber = scanner.nextInt();
        boolean flag = false;


        // use the && operator to see if the user's number is divisible by both 4 and 7

        if(chosenNumber % 4 == 0 && chosenNumber % 7 == 0) {
            flag = true;
        }

        // use the || operator to see if the user's number is divisible by 4 or 7

        if(chosenNumber % 4 == 0 || chosenNumber % 7 == 0) {
            flag = true;
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively

        if(chosenNumber % 4 == 0 ^ chosenNumber % 7 == 0) {
            flag = true;
        }

        // print out the results

        if(flag == true) {
            System.out.println(chosenNumber + " is divisible by 4 and 7.");
            System.out.println(chosenNumber + " is divisible by 4 or 7.");
            System.out.println(chosenNumber + " is wether divisible by 4 or 7.");

        } else {
            System.out.println(chosenNumber + " is not divisible by 4 and 7.");
            System.out.println(chosenNumber + " is not divisible by 4 nor 7.");
            System.out.println(chosenNumber + " is neither divisible by 4 nor 7.");

        }
    }
}


/*
   // use the && operator to see if the user's number is divisible by both 4 and 7

        if(chosenNumber % 4 == 0 && chosenNumber % 7 == 0) {
            System.out.println(chosenNumber + " is divisible by 4 and 7.");
        } else {
            System.out.println(chosenNumber + " is not divisible by 4 and 7.");
        }

        // use the || operator to see if the user's number is divisible by 4 or 7

        if(chosenNumber % 4 == 0 || chosenNumber % 7 == 0) {
            System.out.println(chosenNumber + " is divisible by 4 or 7.");
        } else {
            System.out.println(chosenNumber + " is not divisible by 4 nor 7.");
        }


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively

        if(chosenNumber % 4 == 0 ^ chosenNumber % 7 == 0) {
            System.out.println(chosenNumber + " is wether divisible by 4 or 7.");
        } else {
            System.out.println(chosenNumber + " is neither divisible by 4 nor 7.");
        }

 */