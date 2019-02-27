package com.codingnomads.part_09;

import java.io.BufferedReader;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

/**
 * Bonus questions not covered in book.
 * <p>
 * Write a class that can get the date of the last modification, can check whether or not you can write to that file
 * and can set a file to read-only.
 * Hint, use the "File" class.
 */

public class Exercise_04 {
    public static void main(String[] args) {

        File file = new File("/Users/cristianperez/Documents/CodingNomads/onsitecodingnomads/" +
                "course-java-labs-fundamentals/src/main/java/com/codingnomads/part_09/Exercise01/input");

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(file.lastModified());
        Integer year = calendar.get(Calendar.YEAR);
        Integer month = calendar.get(Calendar.MONTH) + 1;
        Integer day = calendar.get(Calendar.DAY_OF_MONTH);
        String lastModifiedDate = Integer.toString(day).concat("/").concat(Integer.toString(month)
                .concat("/").concat(Integer.toString(year)));

        System.out.println();
        System.out.println("Last modification of the file was: " + lastModifiedDate);
        System.out.println("It is " + file.canWrite() + " that you can write to this file");
        System.out.println("It is " + file.setReadOnly() + " that this is now a read-only file");

    }
}








