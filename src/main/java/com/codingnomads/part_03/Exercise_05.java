package com.codingnomads.part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number >=1 and <= 999,999,999: ");
        int userNum = scanner.nextInt();


        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (userNum % 4 == 0 && userNum % 7 == 0) {
            System.out.println("it is divisible by 4 and 7");
        } // use the || operator to see if the user's number is divisible by 4 or 7
        if (userNum % 4 == 0 || userNum % 7 == 0) {
            System.out.println("it is divisible by 4 or 7");
        } // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if (userNum % 4 == 0 ^ userNum % 7 == 0) {
            System.out.println("it is divisible for 4 or 7 exclusively");
        } else {
            System.out.println("It did not meet any criteria");
        }


        // print out the results

    }
}


