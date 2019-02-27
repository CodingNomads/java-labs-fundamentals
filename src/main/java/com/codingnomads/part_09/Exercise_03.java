package com.codingnomads.part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
 * be sure to close all connections
 */

public class Exercise_03 {

    public static void main(String[] args) {
        readFileBufferedReader();
        System.out.println();
        readFileBufferedReaderLine();
    }

    public static void readFileBufferedReader() {
        int i;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/pbx/CodingNomads/test_text_file.txt"))) {

            do {
                i = bufferedReader.read();
                if (i != -1) System.out.println(i + "\t");
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("IO Exception");
        }

    }

    // todo why is this ignoring the last line of my file?
    public static void readFileBufferedReaderLine() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/pbx/CodingNomads/test_text_file.txt"))) {
            do {
                System.out.println(bufferedReader.readLine());
            } while ((bufferedReader.readLine()) != null);
        } catch (IOException exc) {
            System.out.println("IO Exception");
        }

    }

}
