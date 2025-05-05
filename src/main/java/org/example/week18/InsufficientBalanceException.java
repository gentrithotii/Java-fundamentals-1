package org.example.week18;

public class InsufficientBalanceException extends RuntimeException {
    private double amount;

    public InsufficientBalanceException(double amount) {
        this.amount = amount;
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }

    public double getAmount() {
        return amount;
    }
}
