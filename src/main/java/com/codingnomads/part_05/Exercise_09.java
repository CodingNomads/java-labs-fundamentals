package com.codingnomads.part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class Exercise_09 {

    public static void main(String[] args) {

        add("making some sentences", " with stringbuilder");
        add("J","O","R","D","A","N");
        add("CO","DIN","G","NOM","AD","S");

    }

    public static String add(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String arg : strings)
            stringBuilder.append(arg);
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}


