package com.codewithswyam;

import java.text.NumberFormat;
import java.util.Scanner;

public class RefactoredMortgageCalculator {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readInput("Please enter principal amount:\t", 1000, 10_000_000);
        float annualInterestRate = (float) readInput("Please enter annual interest rate:\t", 2, 5);
        byte numberOfYears = (byte) readInput("Please enter period in number of years:\t", 1, 30);

        printMortgage(principal, annualInterestRate, numberOfYears);

        printPaymentSchedule(principal, annualInterestRate, numberOfYears);
    }

    public static void printMortgage(int principal, float annualInterestRate, byte numberOfYears) {
        double mortgage = calculateMortgage(principal, annualInterestRate, numberOfYears);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("\nMonthly Mortgage");
        System.out.println("--------------------");
        System.out.println("Your monthly mortgage amount will be:\t" + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterestRate, byte numberOfYears) {
        System.out.println("\nPayment Schedule");
        System.out.println("--------------------");
        for (short month = 1; month <= numberOfYears * MONTHS_IN_YEAR; month++) {
            float balance = (float) remainingLoanBalance(principal, annualInterestRate, numberOfYears, month);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balance);
        }
    }

    //Declaring another method to read input
    public static double readInput(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();

            if (value >= min && value <= max)
                break;
            else
                System.out.println("Please enter number of years in between " + min + "to" + max);

        }
        return value;
    }

    //Declaring Mortgage calculation in a separate method
    public static double calculateMortgage(int principal,
                                           float annualInterestRate,
                                           byte numberOfYears) {
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        float numberOfPayments = (short) (numberOfYears * MONTHS_IN_YEAR);

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;
    }

    public static double remainingLoanBalance(int principal,
                                              float annualInterestRate,
                                              byte numberOfYears,
                                              short numberOfPaymentsMade) {
        float monthlyInterestRate = annualInterestRate / MONTHS_IN_YEAR / PERCENT;
        float numberOfPayments = (short) (numberOfYears * MONTHS_IN_YEAR);

        double balance = principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return balance;
    }
}

