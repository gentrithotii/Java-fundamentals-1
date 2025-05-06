package org.example.week18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExceptionExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        taskOne(userInput);
//        taskTwo(userInput);
//        taskThree();


        List<Integer> numberTest = taskFour();

        numberTest.forEach(System.out::println);

    }

    static List<Integer> taskFour() {
        List<Integer> numbers = null;
        Path filePath = Paths.get("filesforexercises/numbers-3.csv");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            numbers = reader.lines()
                    .flatMap(line -> Stream.of(line.split(",")))
                    .map(s -> {
                        try {
                            return Integer.parseInt(s.trim());
                        } catch (NumberFormatException e) {
                            throw new RuntimeException("Could not format String to Number: " + s);
                        }
                    })
                    .toList();
        } catch (NoSuchFileException e) {
            throw new RuntimeException("File not found at path: " + filePath, e);
        } catch (IOException e) {
            System.out.println("Error reading the file!");
        }

        return numbers;
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

class BankAccount {
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

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (getBalance() < amount) {
            double needed = amount - getBalance();
            throw new InsufficientBalanceException("You need " + needed + " more to withdraw" + amount);
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public double getBalance() {
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



