package com.codewithswyam;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myAge = 31;
        int herAge = myAge;
        long youtubeViewCounts = 123_456_789_12L;
        float price = 10.99F;
        String section = "aB" + "\"Swyam\"";
        String path = "C:\\Windows\\";
        boolean isEligible = true;
        Date now = new Date();
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point2.x = 4;
        //Single dimensional array
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[3] = 4;
        int[] newNumbers = {10, 2, 3, 4, 5};
        Arrays.sort(newNumbers);
        //Multi dimensional array
        int[][] multiDimensionalArray = new int[2][3]; //2 rows and 3 columns
        multiDimensionalArray[1][1] = 2;
        int[][] newMultiDimensionalArray = {{1, 2, 3}, {4, 5, 6}};
        final float PI = 3.14F;
        double arithmetic = (double) 10 / (double) 3;
        int newArithmetic = 12 * 6 / 2;
        //Implicit casting
        short x = 1;
        int y = x + 1; //Casting happening automatically as y is an integer which has 4 bytes and short is 2 bytes hence y can be calculated. So order is byte>short>int>long>float>double.
        //Explicit casting
        double a = 2.2;
        int b = (int) a + 2; //Explicit casting
        //Parsing
        String l = "1";
        int m = Integer.parseInt(l) + 3; //Parsing as in string is converted to integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        //Switch statement
        String role = null;
        switch (role) {
            case "admin":
                System.out.println("You're an Admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
        System.out.println("You are: " + age);
        System.out.println(m);
        System.out.println(b);
        System.out.println(y);
        System.out.println(newArithmetic);
        System.out.println(now);
        System.out.println(arithmetic);
        System.out.println(PI);
        System.out.println(Arrays.deepToString(newMultiDimensionalArray));
        System.out.println(Arrays.deepToString(multiDimensionalArray));
        System.out.println(Arrays.toString(newNumbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(point1);
        System.out.println(section.length());
        System.out.println(section.indexOf("a"));
        System.out.println(section.replace('a', 'A'));
        System.out.println(path);
    }
}
