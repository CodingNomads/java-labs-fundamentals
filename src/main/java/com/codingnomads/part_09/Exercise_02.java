package com.codingnomads.part_09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections
 */

public class Exercise_02 {

    public static void main(String[] args) {
        readFileBufferedInputStream();
    }

    public static void readFileBufferedInputStream() {
        int i;
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("/home/pbx/CodingNomads/test_text_file.txt"))) {

            do {
                i = bufferedInputStream.read();
                if (i != -1) System.out.print(i + "\t");
            } while (i != 1);
        } catch (IOException exc) {
            System.out.println("IO Exception");
        }

    }

}
