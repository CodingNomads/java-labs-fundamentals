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

        Scanner input = new Scanner(System.in);

        int numToBePrinted = Integer.parseInt(input.nextLine());

        if (numToBePrinted > 1) {
        } else {
                System.out.println("ONE");
                return;
            }

            if (numToBePrinted > 2) {
            } else {
                System.out.println("TWO");
                return;
            }
                if (numToBePrinted > 3) {
                } else {
                    System.out.println("THREE");
                    return;
                }
                    if (numToBePrinted > 4) {
                    } else {
                        System.out.println("FOUR");
                        return;
                    }
                        if (numToBePrinted > 5) {
                        } else {
                            System.out.println("FIVE");
                            return;
                        }
                            if (numToBePrinted > 6) {
                            } else {
                                System.out.println("SIX");
                                return;
                            }
                                if (numToBePrinted > 7) {
                                } else {
                                    System.out.println("SEVEN");
                                    return;
                                }
                                    if (numToBePrinted > 8) {
                                    } else {
                                        System.out.println("EIGHT");
                                        return;
                                    }
                                        if (numToBePrinted > 9) {
                                        } else {
                                            System.out.println("NINE");
                                            return;
                                        }
                                            if (numToBePrinted > 10) {
                                            } else {
                                                System.out.println("OTHER");

                                            }
    }
}
