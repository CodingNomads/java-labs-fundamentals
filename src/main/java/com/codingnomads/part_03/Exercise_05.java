package com.codingnomads.part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999


        // use the && operator to see if the user's number is divisible by both 4 and 7


        // use the || operator to see if the user's number is divisible by 4 or 7


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively


        // print out the results

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number between 0 - 1.000.000");
        int val = input.nextInt();

        if (val % 4 == 0 && val % 7 == 0)
            System.out.println("Your number is divisible both 4 & 7");

        if (val % 4 == 0 || val % 7 == 0){
            String divider = val % 4 == 0 ? "4" : "7";
            System.out.println("Your number is divisible by " + divider);
        }

        if (val % 4 == 0 ^ val % 7 == 0){
            String divider = val % 4 != 0 ? "4" : "7";
            System.out.println("Your number is not divisible by " + divider);
            return;
        }
    }
}


