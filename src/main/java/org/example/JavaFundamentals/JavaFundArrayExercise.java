package org.example.JavaFundamentals;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class JavaFundArrayExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] cityArray = new String[]{"Paris", "London", "New York", "Stockholm"};
        int[] exerciseSumArray = new int[]{43, 5, 23, 17, 2, 14};
        int[] exerciseHoldOddNumbers = new int[]{1, 2, 4, 7, 9, 12};
        int[] exerciseDuplicateNumbers = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[][] multiplicationArray = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
//        int[] arrayNumbers2 = new int[]{1, 15, 20};
//        int[] copyArrayNumbers2 = copyArrayOfInt(arrayNumbers2);
//        System.out.println(Arrays.toString(copyArrayNumbers2));
//        String[][] twoDimensionArray = new String[][]{
//        {"France", "Paris"},
//        {"Sweden", "Stockholm"}
//        };
//        twoDimensionArrayPrint(twoDimensionArray);

//         int[] arrayNumbers = new int[0];
//        arrayNumbers = storeIntInArray(userInput, arrayNumbers);
//        printUserArray(arrayNumbers);
//        indexOfArrayNum(userInput, arrayNumbers);
//        sortArrayByLetter(cityArray);
//        double sumOfArray = sumIntArray(exerciseSumArray);
//        printOddNumbers(exerciseHoldOddNumbers);
//       RemoveDuplicateNumbers(exerciseDuplicateNumbers);

    }


    public static void RemoveDuplicateNumbers(int[] numberArray) {
        Arrays.sort(numberArray);
        int prevNum = numberArray[0];
        System.out.println("Array Numbers sorted: " + Arrays.toString(numberArray));
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == prevNum) {
                numberArray = removeIntAtIndex(numberArray, i);
            }
            prevNum = numberArray[i];
        }


        System.out.println(Arrays.toString(numberArray));
    }

    public static int[] removeIntAtIndex(int[] numberArray, int indexToRemove) {

        int[] newNumberArray = new int[numberArray.length - 1];

        for (int i = 0, k = 0; i < numberArray.length; i++) {
            if (i == indexToRemove) {
                continue;
            }

            newNumberArray[k++] = numberArray[i];

        }
        return newNumberArray;
    }

    public static void printOddNumbers(int[] numberArray) {
        printUserArray(numberArray);
        System.out.print("Odd Array: ");
        for (int num : numberArray) {
            if (num % 2 != 0) {
                System.out.print(num);
                System.out.print(", ");
            }
        }
    }

    public static double sumIntArray(int[] numberArray) {
        double sum = 0;
        for (int j : numberArray) {
            sum += j;
        }
        sum /= numberArray.length;
        return sum;
    }

    public static void twoDimensionArrayPrint(String[][] twoDimensionArray) {
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
        for (int userNumber : userNumbers) {
            System.out.print(userNumber);
            System.out.print(", ");
        }
        System.out.println(" ");
    }

    public static int[] addOneIntToArray(int[] oldArray, int number) {
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[newArray.length - 1] = number;

        return newArray;
    }


}

