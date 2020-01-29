package com.codewithswyam;

public class MortgageCalculator {
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;
    private int principal;
    private float annualInterestRate;
    private byte numberOfYears;

    public MortgageCalculator(int principal, float annualInterestRate, byte numberOfYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
    }

    //Declaring Mortgage calculation in a separate method
    public double calculateMortgage() {
        float monthlyInterestRate = getMonthlyInterestRate();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return mortgage;
    }

    public double remainingLoanBalance(short numberOfPaymentsMade) {
        float monthlyInterestRate = getMonthlyInterestRate();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        return balance;
    }

    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = (float) remainingLoanBalance(month);
        return balances;
    }

    private short getNumberOfPayments() {
        return (short) (numberOfYears * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / MONTHS_IN_YEAR / PERCENT;
    }
}
