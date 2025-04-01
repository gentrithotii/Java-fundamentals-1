package org.example.java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class JavaFundArrayExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] cityArray = new String[]{"Paris", "London", "New York", "Stockholm"};
        int[] exerciseSumArray = new int[]{43, 5, 23, 17, 2, 14};
        int[] exerciseHoldOddNumbers = new int[]{1, 2, 4, 7, 9, 12};
        int[] exerciseDuplicateNumbers = new int[]{20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[][] multiplicationArray = new int[10][10];
        int[][] twoDimensionArray = new int[3][3];
        int[] numbersToAdd = new int[0];
        int[] firstArrayRandomNumbs = new int[]{15, 34, 22, 12, 63, 103, 52, 12, 53, 32, 635, 144, 522};
        int[] secondArrayRandomNumbs = new int[]{12, 43, 543, 4, 32, 234, 234, 342, 34, 54, 543, 534, 5, 453, 5, 34, 4, 75, 98, 3, 2};
        int[] combinedAndSortedByOddToEven = new int[0];
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
//        printMultiplicationArray(multiplicationArray);
//        addNumbersToArrayAndReverse(userInput, numbersToAdd);
//        createTwoDimensionArrayOfThree(twoDimensionArray);
        combinedAndSortedByOddToEven = combineTwoArrays(firstArrayRandomNumbs, secondArrayRandomNumbs);
        System.out.println("Sorted odd to even: " + Arrays.toString(combinedAndSortedByOddToEven));
    }

    public static int[] combineTwoArrays(int[] arrayOne, int[] arrayTwo) {
        int[] combinedArray = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < arrayOne.length; i++) {
            combinedArray[i] = arrayOne[i];
        }

        int startFromSecondArrayNumbers = arrayOne.length;
        for (int i = startFromSecondArrayNumbers, j = 0; j < arrayTwo.length; i++, j++) {
            combinedArray[i] = arrayTwo[j];
        }
        combinedArray = sortEvenToOdd(combinedArray);

        return combinedArray;
    }

    public static int[] sortEvenToOdd(int[] numberArray) {
        int leftSide = 0, rightSide = numberArray.length - 1;
        int[] orderedArrayNum = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 0) {
                orderedArrayNum[rightSide] = numberArray[i];
                rightSide--;
            } else {
                orderedArrayNum[leftSide] = numberArray[i];
                leftSide++;
            }
        }
        return orderedArrayNum;
    }

    public static void createTwoDimensionArrayOfThree(int[][] numberArray) {
        int numOne, numTwo;
        for (int i = 0; i < numberArray.length; i++) {
            numOne = i + 1;
            for (int j = 0; j < numberArray.length; j++) {
                numTwo = j + 1;
                numberArray[i][j] = numOne * numTwo;

                System.out.printf("%5d", numberArray[i][j]);

            }
            System.out.println(" ");
        }

        getDiagonalFromArray(numberArray);

    }

    private static void getDiagonalFromArray(int[][] numberArray) {
        System.out.println(" ");
        for (int i = 0, k = 0; i < numberArray.length; i++, k++) {

            for (int j = 0; j < numberArray.length; j++) {

                if (k == j) {
                    System.out.print(numberArray[i][j]);
                }
            }

            System.out.print(" ");
        }
    }

    public static void addNumbersToArrayAndReverse(Scanner sc, int[] numArray) {
        while (true) {
            System.out.print("Enter the number you want to add and enter -1 when you want to stop adding: ");
            int userNum = sc.nextInt();
            if (userNum == -1) {
                System.out.println("You quit");
                break;
            }
            numArray = addOneNumberToArray(numArray, userNum);
        }
        System.out.println(Arrays.toString(numArray));
        int[] reversedArray = reversArrayOfInt(numArray);

        System.out.println(Arrays.toString(reversedArray));
    }

    public static int[] reversArrayOfInt(int[] oldArray) {
        int[] reversedArray = new int[oldArray.length];
        int arrayStartPoint = 0;
        for (int i = oldArray.length - 1, j = 0; i >= arrayStartPoint; i--, j++) {
            reversedArray[j] = oldArray[i];
        }
        return reversedArray;
    }

    public static int[] addOneNumberToArray(int[] numbers, int numberToAdd) {
        int[] newNumbers = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i];
        }

        newNumbers[newNumbers.length - 1] = numberToAdd;
        return newNumbers;
    }

    public static void printMultiplicationArray(int[][] multiplicationArray) {
        int firstLoopNum, secondLoopNum;
        for (int i = 0; i < multiplicationArray.length; ++i) {

            firstLoopNum = i + 1;

            for (int j = 0; j < multiplicationArray.length; ++j) {

                secondLoopNum = j + 1;
                multiplicationArray[i][j] = firstLoopNum * secondLoopNum;

                System.out.printf("%5d", multiplicationArray[i][j]);
            }
            System.out.println(" ");
        }
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

