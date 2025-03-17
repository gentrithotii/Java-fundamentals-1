package org.example.JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class JavaFundArrayExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] cityArray = new String[]{"Paris", "London", "New York", "Stockholm"};
//        int[] arrayNumbers2 = new int[]{1, 15, 20};
//        int[] copyArrayNumbers2 = copyArrayOfInt(arrayNumbers2);
//        System.out.println(Arrays.toString(copyArrayNumbers2));
//        String[][] twoDimensionArray = new String[][]{{"France", "Paris"}, {"Sweden", "Stockholm"}};
//        twoDimensionArrayPrint(twoDimensionArray);


        //        int[] arrayNumbers = new int[0];
//        arrayNumbers = storeIntInArray(userInput, arrayNumbers);
//        printUserArray(arrayNumbers);
//        indexOfArrayNum(userInput, arrayNumbers);
//        sortArrayByLetter(cityArray);

    }

    private static void twoDimensionArrayPrint(String[][] twoDimensionArray) {
        for (int i = 0; i < twoDimensionArray.length; i++) {
            for (int j = 0; j < twoDimensionArray.length; j++) {
                System.out.println(" ");
                System.out.print(twoDimensionArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


    public static int[] copyArrayOfInt(int[] arrayToCopy) {
        return Arrays.copyOf(arrayToCopy, arrayToCopy.length);
    }

    public static void sortArrayByLetter(String[] arrayOfStrings) {
        Arrays.sort(arrayOfStrings, String.CASE_INSENSITIVE_ORDER);
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

