package com.codingnomads.part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Exercise_09{
    public static void main(String[] args) {

        prettify("mess", "Of", "A", "sentENCe", "wHiCH", "looKs", "CRAPPY");
        prettify("tHIs", "One", "is", "ALSO", "a", "mess");
        prettify("Hello");

    }

    public static void prettify(String ... word) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String i : word) {
            stringBuilder.append(i.toLowerCase());
            stringBuilder.append(" ");
        }

        String firstLetter = Character.toString(stringBuilder.charAt(0)).toUpperCase();
        stringBuilder.replace(0, 1, firstLetter);

        System.out.print(stringBuilder);
        System.out.println();
    }
}




