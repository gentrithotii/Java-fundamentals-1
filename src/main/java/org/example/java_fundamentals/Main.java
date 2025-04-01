package org.example.java_fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner getInput = new Scanner(System.in);

//        getLeapYear(getInput);
//
//        sumProgram(getInput);
//
//        System.out.println(returnAverageNum(23, 11, 77));
//
//        userInputName(getInput);
//
//        convertSecondsToTime(getInput);
//
//        randomNumGenGame(getInput);
//        daysToSecondsConverter(getInput);
        calculateGiftTax(getInput);

    }

    public static void calculateGiftTax(Scanner sc) {
        double taxLowerLimit, taxVariable;
        double result;
        System.out.print("Enter the value of the gift:  ");
        double valueOfGift = sc.nextDouble();

        if (valueOfGift >= 5000 && valueOfGift <= 25000) {
            taxLowerLimit = 100;
            taxVariable = 0.08;
            result = taxLowerLimit + (valueOfGift - 5000) * taxVariable;
            System.out.println(result);
        } else if (valueOfGift >= 25000 && valueOfGift <= 55000) {
            taxLowerLimit = 1700;
            taxVariable = 0.10;
            result = taxLowerLimit + (valueOfGift - 25000) * taxVariable;
            System.out.println(result);

        } else if (valueOfGift >= 55000 && valueOfGift <= 200000) {
            taxVariable = 0.12;
            taxLowerLimit = 4700;
            result = taxLowerLimit + (valueOfGift - 55000) * taxVariable;
            System.out.println(result);

        } else if (valueOfGift >= 200000 && valueOfGift <= 1000000) {
            taxVariable = 0.15;
            taxLowerLimit = 22100;
            result = taxLowerLimit + (valueOfGift - 200000) * taxVariable;
            System.out.println(result);

        } else if (valueOfGift >= 1000000) {
            taxVariable = 0.17;
            taxLowerLimit = 142000;
            result = taxLowerLimit + (valueOfGift - 1000000) * taxVariable;
            System.out.println(result);

        } else {
            System.out.println("No Tax!");
        }

    }

    public static void convertSecondsToTime(Scanner sc) {
        System.out.print("Enter the amount of seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void daysToSecondsConverter(Scanner sc) {
        System.out.print("Enter the number of days you want to convert to sec: ");
        int daysToConvert = sc.nextInt();
        int oneDaySec = 86400;
        daysToConvert = daysToConvert * oneDaySec;

        System.out.println(daysToConvert);
    }

    public static void randomNumGenGame(Scanner sc) {
        int toGuess, playerGuess, numberOfTries = 0;
        boolean gameLoop = true;
        Random rand = new Random();
        int limit = 500;
        toGuess = rand.nextInt(1, 500);


        while (gameLoop) {
            System.out.print("Guess the number: ");
            playerGuess = sc.nextInt();

            if (playerGuess == toGuess) {
                System.out.println("You have guessed right: " + playerGuess + " and you tried: " + numberOfTries);
                gameLoop = false;
            } else if (playerGuess < toGuess) {
                System.out.println("The num is higher " + "and you guessed: " + playerGuess);
                numberOfTries++;

            } else if (playerGuess > limit) {
                System.out.println("You can guess only from 1 to 500 only");
                numberOfTries++;
            } else {
                System.out.println("The guess is lower" + " and you guessed: " + playerGuess);
                numberOfTries++;
            }
        }

    }


    public static void sumProgram(Scanner userInput) {
        System.out.print("Enter first num: ");
        int a = userInput.nextInt();
        System.out.print("Enter Second num: ");
        int b = userInput.nextInt();
        int result;
        char[] charSet = {'+', '*', '/', '-'};

        for (char op : charSet) {
            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println(a + " + " + b + " sum is: " + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println(a + " * " + b + " and the sum is: " + result);
                    break;
                case '/':
                    result = a / b;
                    System.out.println(a + " / " + b + " and the sum is: " + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println(a + " - " + b + " and the sum is: " + result);
                    break;
                default:
                    System.out.println("Enter the right operator like +, -, *, / ");
            }

        }
    }


    public static void getLeapYear(Scanner sc) {
        System.out.print("Enter the leap year Number: ");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            System.out.println("Its Leap year");
        } else {
            System.out.println("Its not leap year");
        }
    }

    public static int returnAverageNum(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void userInputName(Scanner userInput) {
        System.out.print("Enter your userName to print it out:");
        String test = userInput.next();
        System.out.println(test);
    }
}
