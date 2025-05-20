package com.pluralsight.finance;

public class BankAccount {
    private String name;
    private String accountName;
    private double balance;

    public BankAccount(String name, String accountName, double balance) {
        this.name = name;
        this.accountName = accountName;
        this.balance = balance;
    }
    private double getAmount() {
        return 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public double getValue() {
        return balance;
    }
}
