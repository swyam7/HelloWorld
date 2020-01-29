package com.codewithswyam;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    private MortgageCalculator calculator;

    public void printPaymentSchedule() {
        System.out.println("\nPayment Schedule");
        System.out.println("--------------------");
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));

    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("\nMonthly Mortgage");
        System.out.println("--------------------");
        System.out.println("Your monthly mortgage amount will be:\t" + mortgageFormatted);
    }
}
