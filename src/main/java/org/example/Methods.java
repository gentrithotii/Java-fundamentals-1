package org.example;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        printText(userInput);
//        printUntilNumber(2);
//        printFromNumberToOne(6);
//        division(3, 5);
//        divisibleByThreeInRange(2, 10);
//        System.out.println(numberUno());
//        System.out.println(word());
//        int answer = sum(4, 3, 6, 1);
//        System.out.println("Sum: " + answer);
//        int answer = greatest(2, 1, 7);
//        System.out.println(answer);
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);

    }

    public static double average(int num1, int num2, int num3, int num4) {
        int storeSum = sum(num1, num2, num3, num4);
        int numberOfNums = 4;

        return (double) storeSum / numberOfNums;
    }

    public static int greatest(int number1, int number2, int number3) {
        int greatest = number1;

        if (number2 > greatest) {
            greatest = number2;
        }
        if (number3 > greatest) {
            greatest = number3;
        }

        return greatest;
    }

    public static int smallest(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }

    public static int sum(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4;
    }

    public static String word() {
        return "Hello";
    }

    public static int numberUno() {
        return 1;
    }

    public static void divisibleByThreeInRange(int beginning, int end) {

        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }

    public static void division(int numerator, int denominator) {
        double result;
        result = (double) numerator / denominator;
        System.out.println(result);

    }

    public static void printUntilNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void printText(Scanner sc) {
        System.out.println("Enter the number of times you want to print the text");
        int userInput = sc.nextInt();

        for (int i = 1; i <= userInput; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }

    public static void printFromNumberToOne(int num) {
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
