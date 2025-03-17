package org.example.JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class JavaFundArrayExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        storeAndPrintIntArray(userInput);
    }

    public static void storeAndPrintIntArray(Scanner userInput) {
        int[] userNumbers = new int[0];

        while (true) {
            System.out.print("Enter the number you want to add enter 0 if you want to quit:   ");
            int userNumber = userInput.nextInt();
            if (userNumber != 0) {
                userNumbers = addOneIntToArray(userNumbers, userNumber);
            } else {
                break;
            }
        }
        System.out.print("Your numbers are:");
        System.out.print(", ");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(userNumbers[i]);
            System.out.print(" ");
        }
    }

    public static int[] addOneIntToArray(int[] oldArray, int number) {
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[newArray.length - 1] = number;

        return newArray;
    }


}

