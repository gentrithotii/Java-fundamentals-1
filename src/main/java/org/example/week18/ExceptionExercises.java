package org.example.week18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        taskOne(userInput);
        taskTwo(userInput);
//        taskThree();

    }

    static void taskThree() {
        BankAccount gentritAccount = new BankAccount("Gentrit Account");

        gentritAccount.deposit(500);
        System.out.println(gentritAccount.getBalance());
        gentritAccount.withdraw(600);

        System.out.println(gentritAccount.getBalance());
        gentritAccount.deposit(600);

        System.out.println(gentritAccount.getBalance());

        gentritAccount.withdraw(300);
        System.out.println(gentritAccount.getBalance());
    }

    static class BankAccount {
        private double balance;
        private String accountName;

        public BankAccount(String accountName) {
            setAccountName(accountName);
        }

        public BankAccount(String accountName, double balance) {
            this(accountName);
            setBalance(balance);

        }

        public void deposit(double amount) {
            setBalance(getBalance() + amount);
        }

        public void withdraw(double amount) {
            if (getBalance() < amount) {
                System.out.println("You dont have that amount");
            } else {
                setBalance(getBalance() - amount);
            }
        }

        private double getBalance() {
            return balance;
        }

        private void setBalance(double balance) {
            this.balance = balance;
        }

        private String getAccountName() {
            return accountName;
        }

        private void setAccountName(String accountName) {
            this.accountName = accountName;
        }
    }

    static void taskTwo(Scanner sc) {

        while (true) {
            try {
                System.out.print("Enter the number that you want to check if its in range: ");
                int userNum = sc.nextInt();
                if (userNum < 1 || userNum > 100) {
                    throw new Exception();
                } else {
                    System.out.println("Number is in range");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Not in range");
            }
        }

    }

    static void taskOne(Scanner sc) {
        System.out.print("Enter the number you want to divide: ");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.println(" ");
        System.out.print("Enter the second number you want to divide: ");
        int secondNum = Integer.parseInt(sc.nextLine());

        try {
            double result = firstNum / secondNum;
            System.out.println("The result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide " + e.getMessage());
        }
    }
}


