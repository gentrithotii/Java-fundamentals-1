package org.example.JavaOOP.exercise_bank_account;

public class BankAccountHelper {
    private static long accountNumberIncrement;

    public synchronized String getAccountNumber() {
        return Long.toString(++accountNumberIncrement);
    }
}
