package org.example.JavaOOP.Exercise_Bank_Account;

public class BankAccountHelper {
    private static long accountNumberIncrement;

    public synchronized String getAccountNumber() {
        return Long.toString(++accountNumberIncrement);
    }
}
