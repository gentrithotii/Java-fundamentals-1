package org.example.JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class JavaFundArrayExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] arrayNumbers = new int[0];
        arrayNumbers = storeIntInArray(userInput, arrayNumbers);
        printUserArray(arrayNumbers);
        indexOfArrayNum(userInput, arrayNumbers);
    }

    public static void indexOfArrayNum(Scanner userInput, int[] numberArray) {
        System.out.print("Enter the number that your looking for to print the index of: ");
        int userNumberToFind = userInput.nextInt();
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == userNumberToFind) {
                System.out.println("Your number: " + numberArray[i] + " is at index of " + i);
            }
        }
    }

    public static int[] storeIntInArray(Scanner userInput, int[] userNumbers) {
        while (true) {
            System.out.print("Enter the number you want to add enter 0 if you want to quit:   ");
            int userNumber = userInput.nextInt();
            if (userNumber != 0) {
                userNumbers = addOneIntToArray(userNumbers, userNumber);
            } else {
                break;
            }
        }
        return userNumbers;
    }

    private static void printUserArray(int[] userNumbers) {
        System.out.print("Your numbers are: ");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.print(userNumbers[i]);
            System.out.print(", ");
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    public static int[] addOneIntToArray(int[] oldArray, int number) {
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[newArray.length - 1] = number;

        return newArray;
    }


}

