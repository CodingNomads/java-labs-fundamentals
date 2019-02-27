package com.codingnomads.part_09;

import java.io.*;

/**
 * Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.
 * Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        File source = new File("/home/pbx/CodingNomads/test_text_file.txt");
        File dest = new File("/home/pbx/CodingNomads/test_text_file_copied.txt");
        File dest2 = new File("/home/pbx/CodingNomads/test_text_file_copied_charstream.txt");
        copyFileByte(source, dest);
        copyFileChar(source, dest2);
    }

    // Method to copy file
    private static void copyFileByte(File source, File dest) {
        // private variables
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int i;

        try {
            fileInputStream = new FileInputStream(source); // creating bytestream objects
            fileOutputStream = new FileOutputStream(dest);

        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found"); // exception handling for file not found error
            return;
        }

        try {
            do {
                i = fileInputStream.read(); // do-while loop to set int i to value returned from bytestream reader method
                if (i != -1) System.out.print((char) i); // cast int to char and print to console
                if ((i != -1) && i != 32) { // if EOF or space is not returned, use write method to copy to destination file
                    fileOutputStream.write(i);
                } else if (i == 32) { // convert spaces to hypens
                    fileOutputStream.write((i + 13));
                }
            } while (i != -1); // EOF reached, terminate the loop
        } catch (IOException exc) {
            System.out.println("Error reading file"); // error reading file exception
        } finally { // finally block to close connections
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException exc) {
                System.out.println("Error Reading File");
            }

        }

    }

    // Method to copy file
    private static void copyFileChar(File source, File dest) {
        // private variables
        int i;

        try (FileReader fileReader = new FileReader(source); FileWriter fileWriter = new FileWriter(dest)) {

            do {
                i = fileReader.read(); // do-while loop to set int i to value returned from bytestream reader method
                if (i != -1) System.out.print((char) i); // cast int to char and print to console
                if ((i != -1) && i != 32) { // if EOF or space is not returned, use write method to copy to destination file
                    fileWriter.write(i);
                } else if (i == 32) { // convert spaces to hypens
                    fileWriter.write((i + 13));
                }
            } while (i != -1); // EOF reached, terminate the loop

        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found"); // exception handling for file not found error
        } catch (IOException exc) {
            System.out.println("Error Reading File");
        }
    }
}
