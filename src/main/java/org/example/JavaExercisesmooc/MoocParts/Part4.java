package org.example.JavaExercisesmooc.MoocParts;

import java.time.LocalDateTime;

public class Part4 {
    public static void main(String[] args) {
        Account mathewsAccount = new Account("Mathews account", 1000);
        Account myAccount = new Account("My account ", 0);
        myAccount.deposit(100);
        myAccount.withdraw(50);
        System.out.println(myAccount.getBalance());
        myAccount.printAccountInfo();
        mathewsAccount.printAccountInfo();


    }
}

class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new IllegalArgumentException("You don't have enough money");
        }
        double balance = this.getBalance();
        balance -= amount;
        this.setBalance(balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Can't enter negative numbers");
        }
        this.setBalance(amount);
    }

    public void printAccountInfo() {
        System.out.println("Account name: " + getAccountName() + " And the balance is: " + getBalance());
    }
}


