package org.example;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        absoluteValueConvert(userInput);
//        carryOnBoy(userInput);
//        goTillNumber(userInput);
//        numberOfNegativeNumbers(userInput);
//        sumOfNumbers(userInput);
//        sumOfSequence(userInput);
//        factorialOfNumbers(userInput);
        haveFunWithNumbers(userInput);
    }


    private static void haveFunWithNumbers(Scanner sc) {
        int even = 0, odd = 0;
        double averageNum = 0;
        int numCounter = 0;
        int sum = 0;
        System.out.println("Give numbers:");

        while (true) {
            int userInput = sc.nextInt();
            if (userInput == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (userInput % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
            ++numCounter;
            sum += userInput;

        }
        averageNum += ((double) sum / numCounter);
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numCounter);
        System.out.println("Average: " + averageNum);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }

    private static void factorialOfNumbers(Scanner sc) {
        System.out.print("Give a number for factorial: ");
        int userNum = sc.nextInt();
        int totalSum = 1;

        for (int i = 1; i <= userNum; i++) {
            totalSum *= i;
        }
        System.out.println("Factorial: " + totalSum);
    }

    private static void sumOfSequence(Scanner sc) {
        System.out.print("Enter the first number smaller: ");
        int userNum = sc.nextInt();
        System.out.println("Enter the bigger second number: ");
        int endNumb = sc.nextInt();

        int totalSum = 0;

        for (int i = userNum; i <= endNumb; i++) {
            totalSum += i;

        }

        System.out.println("The sum is: " + totalSum);
    }

    private static void sumOfNumbers(Scanner sc) {
        int result = 0, numCounter = 0;
        while (true) {

            System.out.println("Enter numbers you want to add to list and press 0 to quit the loop of adding");
            int userNum = sc.nextInt();

            if (userNum == 0) {
                System.out.println("Number of numbers: " + numCounter);
                System.out.println("Sum of the numbers: " + result);
                break;
            } else {
                result += userNum;
                ++numCounter;
            }

        }
    }

    private static void numberOfNegativeNumbers(Scanner sc) {
        int negativeNumCounter = 0;

        while (true) {
            System.out.println("Enter the a number and when you press 0 it will quit and show you negative number counter");
            int userNum = sc.nextInt();
            if (userNum < 0) {
                --negativeNumCounter;
            } else if (userNum == 0) {
                break;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumCounter);
    }

    private static void goTillNumber(Scanner sc) {

        while (true) {
            System.out.println("Enter a number but enter 4 if you want to go out of the loop: ");
            int guessNumber = sc.nextInt();
            if (guessNumber == 4) {
                break;
            }

        }
    }

    private static void carryOnBoy(Scanner userInput) {
        while (true) {
            System.out.println("Shall we carry on?");
            String userString = userInput.nextLine();

            if (userString.contains("no")) {
                break;
            }
        }
    }

    public static void absoluteValueConvert(Scanner sc) {
        System.out.print("Enter the number please: ");
        int userNum = sc.nextInt();

        if (userNum <= 0) {
            userNum *= -1;
            System.out.println(userNum);
        } else {
            System.out.println(userNum);
        }

    }

}
