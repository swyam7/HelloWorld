package com.codewithswyam;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    //Declaring another method to read input
    public static double readInput(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();

            if (value >= min && value <= max)
                break;
            else
                System.out.println("Please enter number of years in between " + min + "to" + max);

        }
        return value;
    }
}
