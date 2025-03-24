package org.example.JavaOOP;

import org.example.JavaOOP.Exercise_Bank_Account.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("Gentrit Hoti", "Gentrit@test.com", "0761744881", 1000);
        BankAccount accountTwo = new BankAccount("Gentrit Hoti", "Gentrit@test.com", "0761744881", 6000);
        accountTwo.withdrawMoney(100);
        accountOne.withdrawMoney(300);

        System.out.println(accountOne.getBalance());
        accountTwo.deposit(500.5);
        System.out.println(accountTwo.getBalance());
        accountTwo.deposit(10000);
        System.out.println(accountTwo.getBalance());
        accountTwo.withdrawMoney(17800);

    }
}
