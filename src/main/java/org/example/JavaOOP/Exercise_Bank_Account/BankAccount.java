package org.example.JavaOOP.Exercise_Bank_Account;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static final BankAccountHelper accountNumberHelper = new BankAccountHelper();

    public BankAccount(String customerName, String email, String phoneNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumberHelper.getAccountNumber();
        this.email = email;
        this.phoneNumber = phoneNumber;
        setBalance(balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Enter bigger amount than 0 to balance");
        }
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void withdrawMoney(double amount) {
        if (balance < amount) {
            throw new IllegalArgumentException("You don't have that balance to withdraw from.");
        }
        double result = balance - amount;

        setBalance(result);

    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("You cant deposit negative numbers.");
        }
        double result = balance + amount;

        setBalance(result);
    }

}
