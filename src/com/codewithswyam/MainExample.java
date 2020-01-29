package com.codewithswyam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainExample {
    public static void main(String[] args) {
        try (
                var reader = new FileReader("/Users/swyam/Desktop/SWYAM- HD.NOSYNC/02- Base/03- Personal/05- Document/HP Gas1.txt");
                var writer = new FileWriter("...");
        ) {
            var value = reader.read();
        } catch (IOException e) {
            System.out.println("Could not read data");
        }
    }
}

