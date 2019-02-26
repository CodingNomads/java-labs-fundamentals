package com.codingnomads.part_08;
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Enter Two numbers. The first will be divided by the second.");

        try {
            Scanner input = new Scanner(System.in);
            num1 = input.nextInt();
            System.out.println("Enter one more number");
            num2 = input.nextInt();

            System.out.println(num1 + " / " + num2);

            num2 = num1 / num2;
            System.out.println(num2);
            System.out.println("End of the try block");
        }
        catch (Exception e) {
            System.out.println("Exception occurred. Cannot divide by zero");
        }
    }


}
