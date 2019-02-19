package com.codingnomads.part_01;

/**
 * Part 1 Exercise 4:
 * Write the necessary code to print the following table to the console:
 * <p>
 * a   a*2 a*4
 * 1   2   4
 * 2   4   8
 * 3   6   12
 * 4   8   16
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int a = 1;

        for (int x = 1; x < 5; x++){
            for (int y = 1; y < 2; y++){
                System.out.print(a);
                System.out.print("   ");
                System.out.print(a * 2);
                System.out.print("   ");
                System.out.print(a * 4);
                System.out.print("   ");
            }
            a++;
            System.out.println();
        }



    }

}
