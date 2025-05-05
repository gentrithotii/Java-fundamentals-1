package org.example.week18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercises {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        taskOne(userInput);


        taskTwo(userInput);


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

    static void taskTwo(Scanner sc) {

        while (true) {
            try {
                System.out.print("Enter the number that you want to check if its in range: ");
                int userNum = Integer.parseInt(sc.nextLine());
                if (userNum < 1 || userNum > 100) {
                    throw new InputMismatchException();
                } else {
                    System.out.println("Number is in range");
                }

            } catch (InputMismatchException e) {
                System.out.println("Not in range");
            }
        }

    }

}
