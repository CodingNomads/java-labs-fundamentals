package com.codingnomads.part_09;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * Bonus questions not covered in book.
 * <p>
 * Write a class that can get the date of the last modification, can check whether or not you can write to that file
 * and can set a file to read-only.
 * Hint, use the "File" class.
 */

public class Exercise_04 {

    public static void main(String[] args) {

        File file = new File("filesforcopying/test_03.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println(sdf.format(file.lastModified()));

        System.out.println("The file was writable? " + file.canWrite());
        file.setWritable(false);
        System.out.println("The file is now writable? " + file.canWrite());


    }


}








