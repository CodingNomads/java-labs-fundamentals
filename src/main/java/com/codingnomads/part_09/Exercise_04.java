package com.codingnomads.part_09;

import java.io.File;
import java.time.*;


/**
 * Bonus questions not covered in book.
 * <p>
 * Write a class that can get the date of the last modification, can check whether or not you can write to that file
 * and can set a file to read-only.
 * Hint, use the "File" class.
 */

public class Exercise_04 {

    public static void main(String[] args) {

        File file = new File("/home/pbx/CodingNomads/test_text_file_copied.txt"); //create object of class File
        Instant instant = Instant.ofEpochMilli(file.lastModified()); // pass milliseconds since 01-01-1970 to file last modified in milliseconds to object instant

        System.out.println("File Last Modified: " + instant); // print time

        System.out.println("Can you write to this file?: " + file.canWrite()); // origin

        file.setReadOnly(); // setting file to readonly

        System.out.println("Can you write to this file?: " + file.canWrite());
    }

}








