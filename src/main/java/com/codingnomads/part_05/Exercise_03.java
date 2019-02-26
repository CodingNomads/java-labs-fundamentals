package com.codingnomads.part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Exercise_03 {
    public static void main(String[] args) {

        Countries question = new Countries();

        System.out.println(question.whereAreYouFrom());
        System.out.println(question.whereAreYouFrom("spanish"));
        System.out.println(question.whereAreYouFrom("spanish", true));

    }
}

class Countries {

    public String whereAreYouFrom() {

        return "I am from Colombia";

    }

    public String whereAreYouFrom(String language) {

        return (language.equals("spanish")) ? "Yo soy de Colombia" : whereAreYouFrom();

    }

    public String whereAreYouFrom(String language, boolean accent) {

        return (language.equals("spanish") && accent) ? "Yo soy de Colombia con mucho honor pues!" : whereAreYouFrom("spanish");

    }




}
