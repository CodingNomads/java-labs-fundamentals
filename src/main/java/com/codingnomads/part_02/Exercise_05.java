package com.codingnomads.part_02;
import java.util.*;
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
        System.out.println("Enter a number between 1 and 9: ");
        int input = scanner.nextInt();

        if(input > 1){
            if(input > 2){
                if(input > 3){
                    if(input > 4) {
                        if(input > 5) {
                            if(input > 6){
                                if(input >7){
                                    if(input > 8) {
                                        if(input == 9){
                                            System.out.println("Nine");
                                        }
                                    } else {
                                        System.out.println("Eight");
                                    }
                                } else {
                                    System.out.println("Seven");
                                }
                            } else {
                                System.out.println("Six");
                            }
                        } else {
                            System.out.println("Five");
                        }
                    } else {
                        System.out.println("Four");
                    }
                } else {
                    System.out.println("Three");
                }
            } else{
                System.out.println("Two");
            }
        } else {
            System.out.println("One");
        }
    }
}
