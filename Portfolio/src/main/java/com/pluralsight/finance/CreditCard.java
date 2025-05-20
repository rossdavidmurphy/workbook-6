package com.pluralsight.finance;

public class CreditCard {
    private String name;
    private String accountName;
    private double balance;

    public CreditCard(String name, String accountName, double balance) {
        this.name = name;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void charge(double amount) {
        this.balance += amount;
    }

    public void pay(double amount) {
        this.balance -= amount;
    }

    public double getValue() {
        return balance;
    }
}
