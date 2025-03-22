package org.example.JavaOOP.Exercise_Bank_Account;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String customerName, String email, String accountNumber, String phoneNumber, double balance) {
        this.customerName = customerName;
        this.email = email;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }


}
