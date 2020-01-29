package com.codewithswyam;

public class OopRefactoredMortgageCalculator {

    public static void main(String[] args) {

        int principal = (int) Console.readInput("Please enter principal amount:\t", 1000, 10_000_000);
        float annualInterestRate = (float) Console.readInput("Please enter annual interest rate:\t", 2, 5);
        byte numberOfYears = (byte) Console.readInput("Please enter period in number of years:\t", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterestRate, numberOfYears);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}

