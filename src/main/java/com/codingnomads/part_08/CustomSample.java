package com.codingnomads.part_08;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class CustomSample {

    private static final char[] numbers = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static final List<String> arrayList = new ArrayList<>();
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        startProgram();

    }

    private static boolean runProgram() {
        System.out.println("Enter Names Type QUIT to quit");
        String string = keyboard.nextLine();
        checkIfIsNumber(numbers, string);

        if (string.equalsIgnoreCase("quit")) {
            return false;
        }
        arrayList.add(string);
        for (Object object : arrayList) {
            System.out.print(object.toString() + " ");
        }
        return true;
    }

    private static void checkIfIsNumber(char[] numbers, String string) {
        for (char number : numbers) {
            if (string.contains(number + "")) {
                throw new CustomEx(number + " Can not Used Here");
            }
        }
    }

    public static void startProgram() {
        boolean shouldRun = true;
        while (shouldRun) {
            try {
                shouldRun = runProgram();
            } catch (CustomEx e) {
                System.out.println(e.getMessage());

            }
        }
    }
}


class CustomEx extends RuntimeException {
    public CustomEx(String message) {
        super(message);
    }

}