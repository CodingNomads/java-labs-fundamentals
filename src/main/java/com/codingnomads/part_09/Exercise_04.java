package com.codingnomads.part_09;

import java.io.*;

/**
 * Bonus questions not covered in book.
 * <p>
 * Write a class that can get the date of the last modification, can check whether or not you can write to that file
 * and can set a file to read-only.
 * Hint, use the "File" class.
 */

public class Exercise_04 {
    public static void main(String[] args) {

        File file = new File("/Users/alpdurmaz/Documents/CodingNomads/course_java_fundamentals/course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise1Text2");

        System.out.println("File Read Access = " + file.canRead());
        System.out.println("File Write Access = " + file.canWrite());

        System.out.println("Settin Read Only" + file.setReadOnly());

        System.out.println("File Read Access = " + file.canRead());
        System.out.println("File Write Access = " + file.canWrite());
    }
}









