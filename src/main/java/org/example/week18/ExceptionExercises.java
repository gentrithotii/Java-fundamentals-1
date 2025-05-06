package org.example.week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ExceptionExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        taskOneAndFive(userInput);
//        taskTwo(userInput);
//        taskThree();
//        List<Integer> numberTest = taskFour();
//        numberTest.forEach(System.out::println);
//            taskSix(userInput);
        taskSeven(userInput);

    }

    static void addNameToList(List<String> namesList, Scanner sc) {
        System.out.println("Enter the name you want to add: ");
        String nameToAdd = sc.nextLine();
        if (namesList.contains(nameToAdd)) {
            throw new DuplicateNameException("Cannot add duplicate name to list ", nameToAdd);
        }
        namesList.add(nameToAdd);
        System.out.println("Name has been added.");
    }

    static void findName(List<String> namesList, Scanner sc) {
        System.out.println("Enter the name you want to to find: ");
        String nameToSearch = sc.nextLine();
        if (!namesList.contains(nameToSearch)) {
            throw new NameNotFoundException(nameToSearch + " does not exists");
        }
        System.out.println("Name Exists");
    }

    static void taskSeven(Scanner sc) {
        List<String> names = new ArrayList<>(Arrays.asList("Gentrit", "Anna", "Kevini", "Malik", "Asja", " Lala", "Testi", "Jakobi", "Tinkivinki", "Bober"));

        System.out.println("1. Add Name to list");
        System.out.println("2. Find name in the list");
        int userChoice = Integer.parseInt(sc.nextLine());
        switch (userChoice) {
            case 1:
                addNameToList(names, sc);
                break;
            case 2:
                findName(names, sc);
                break;
            default:
                System.out.println("Wrong Input");
        }

    }

    static void taskSix(Scanner sc) {
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        System.out.print("Enter a valid email address: ");
        String userEmail = sc.nextLine();

        if (Pattern.matches(regexPattern, userEmail)) {
            System.out.println("You have entered a valid email address");
        } else {
            throw new IllegalArgumentException("Invalid Email Address");
        }

    }

    static List<Integer> taskFour() {
        List<Integer> numbers = null;
        Path filePath = Paths.get("filesforexercises/numbers-3.csv");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            numbers = reader.lines().flatMap(line -> Stream.of(line.split(","))).map(s -> {
                try {
                    return Integer.parseInt(s.trim());
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Could not format String to Number: " + s);
                }
            }).toList();
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

    static void taskOneAndFive(Scanner sc) {
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
        } finally {
            System.out.println("Finally has ran");
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



