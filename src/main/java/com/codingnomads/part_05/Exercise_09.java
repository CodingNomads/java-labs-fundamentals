package com.codingnomads.part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarArgSample{
    public static void main(String[] args) {

        displayUpperCase("varArgs", "demonstration", "with", "a","sentence");
        displayLowerCase("CODING" + "NOMADS" + "ALP" + "DURMAZ");
        displayReverse("Outpost" + "Co" + "Working" + "Place" + "Ubud" + "Bali");

    }

    public static void displayUpperCase(String ... strings){

        for (String string : strings) {
            System.out.print(string.toUpperCase() + " ");
        }

        System.out.println();
    }

    public static void displayLowerCase(String ... strings){

        for (String string : strings) {
            System.out.print(string.toLowerCase() + " ");
        }

        System.out.println();
    }

    public static void displayReverse(String ... strings){
        for (String string : strings) {
            for(int i = string.length() - 1; i >= 0; --i){
                System.out.print(string.charAt(i));
            }
            System.out.print(" ");
        }

        System.out.println();
    }
}


