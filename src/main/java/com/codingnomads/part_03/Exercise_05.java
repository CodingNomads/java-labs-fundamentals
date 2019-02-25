package com.codingnomads.part_03;
import java.util.*;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {
        Long number;

        // read an integer from the user >=1 and <= 999,999,999
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number between 1 and 999,999,999");
            number = scanner.nextLong();
        } while(number <=1 || number >= 999999999);

        // use the && operator to see if the user's number is divisible by both 4 and 7

        if (number % 4 == 0 && number % 7 == 0) {
                System.out.println("The number is divisible by both 4 and 7.");
                ;
            }

        // use the || operator to see if the user's number is divisible by 4 or 7
        if(number%4 == 0 || number%7==0) {
            System.out.println("The number is divisible by either 4 or 7.");;
        }

        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        if(number%4 == 0 ^ number%7==0) {
            System.out.println("The number is divisible by 4 and 7 exclusively.");
        }

        // print out the results

    }
}


