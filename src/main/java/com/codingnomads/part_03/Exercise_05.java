package com.codingnomads.part_03;
import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("Enter a number between 1 and 999,999,999");
        Scanner input = new Scanner(System.in);

        int userNumber = Integer.parseInt(input.nextLine());



        // use the && operator to see if the user's number is divisible by both 4 and 7

        if ((userNumber % 4 == 0) && (userNumber % 7 == 0)) {
            System.out.println("Your number is divisible by 4 and 7");
        } else {
            System.out.println("Your number is not divisible by 4 and 7");
        }


        // use the || operator to see if the user's number is divisible by 4 or 7

        if ((userNumber % 4 == 0) || (userNumber % 7 == 0)) {
            System.out.println("Your number is divisible by 4 or 7");
        } else {
            System.out.println("Your number is not divisible by 4 or 7");
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively

        if ((userNumber % 4 == 0) ^ (userNumber % 7 == 0)) {
            System.out.println("Your number is divisible either by 4 & 7, but not both");
        }



        // print out the results

    }
}


