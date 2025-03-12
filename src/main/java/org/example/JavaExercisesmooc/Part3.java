package org.example.JavaExercisesmooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        thirdElementExercise(userInput);
//        secondPlusThird(userInput);
//        generateIndexOutOfBounds();
//        firstAndLastInTheList(userInput);
//        rememberTheseNumbers(userInput);
//        greatestInList(userInput);
//        indexOfNumList(userInput);
//        indexOfSmallestNum(userInput);
//        sumAListAndAverage(userInput);
        findStringOnList(userInput);
    }

    public static void findStringOnList(Scanner sc) {
        ArrayList<String> stringArray = new ArrayList<>();

        while (true) {
            System.out.print("Enter the names you want to add: ");
            String userInput = sc.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringArray.add(userInput);
        }
        System.out.println("--------------------------------------------");
        System.out.print("Enter the name you want to find: ");
        String userToFind = sc.nextLine();

        System.out.println((stringArray.contains(userToFind)) ? userToFind + " was found " : userToFind + " was not found");
    }

    public static void sumAListAndAverage(Scanner sc) {
        ArrayList<Integer> numList = new ArrayList<>();
        while (true) {
            System.out.print("Enter numbers to add in the list , type 9999 to end the loop: ");
            int userNum = sc.nextInt();
            if (userNum == -1) {
                break;
            }
            numList.add(userNum);
        }
        int sumToAdd = 0;
        for (int listNumbers : numList) {
            sumToAdd += listNumbers;
        }
        double averageSum = (double) sumToAdd / numList.size();
        System.out.println("Sum: " + sumToAdd);
        System.out.println("Average: " + averageSum);
    }

    public static void indexOfSmallestNum(Scanner sc) {
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            System.out.print("Enter numbers to add in the list , type 9999 to end the loop: ");
            int userNum = sc.nextInt();
            if (userNum == 9999) {
                break;
            }
            numList.add(userNum);
        }
        if (numList.isEmpty()) {
            System.out.println("Get some numbers in noob");
            return;
        }

        int smallestNum = numList.get(0);

        for (int num : numList) {
            if (smallestNum > num) {
                smallestNum = num;
            }
        }
        System.out.println("Smallest number is : " + smallestNum);
        for (int i = 0; i < numList.size(); i++) {
            if (smallestNum == numList.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }

    public static void indexOfNumList(Scanner sc) {
        ArrayList<Integer> intList = new ArrayList<>();

        while (true) {
            System.out.print("Enter the numbers to add to the list: ");
            int userNum = sc.nextInt();

            if (userNum == -1) {
                break;
            } else {
                intList.add(userNum);
            }
        }

        System.out.print("Enter the num your looking for: ");
        int numToBeSearched = sc.nextInt();
        for (int i = 0; i < intList.size(); i++) {
            if (numToBeSearched == intList.get(i)) {
                System.out.println(intList.get(i) + " is at index of: " + i);
            }
        }
    }

    public static void greatestInList(Scanner sc) {
        ArrayList<Integer> intList = new ArrayList<>();

        while (true) {
            System.out.print("Enter the numbers to add to the list: ");
            int userNum = sc.nextInt();

            if (userNum == -1) {
                break;
            } else {
                intList.add(userNum);
            }
        }

        int biggest = intList.getFirst();
        for (int i = 0; i < intList.size(); i++) {
            int num = intList.get(i);
            if (biggest < num) {
                biggest = num;
            }
        }
        System.out.println(biggest);
    }

    public static void rememberTheseNumbers(Scanner sc) {
        ArrayList<Integer> intList = new ArrayList<>();

        while (true) {
            System.out.print("Enter the numbers to add to the list: ");
            int userNum = sc.nextInt();

            if (userNum == -1) {
                break;
            } else {
                intList.add(userNum);
            }
        }
        System.out.println("From what index: ");
        int fromIndexOf = sc.nextInt();
        System.out.println("To what index: ");
        int toIndexOf = sc.nextInt();

        for (int i = fromIndexOf; i <= toIndexOf; i++) {
            System.out.println(intList.get(i));
        }
    }

    public static void firstAndLastInTheList(Scanner sc) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        while (true) {
            System.out.print("Enter the string you want to add to the String ArrayList: ");
            String textToBeStored = sc.nextLine();

            if (textToBeStored.matches("")) {
                sc.close();
                break;
            }
            stringArrayList.add(textToBeStored);
        }

        int startIndex = 0, lastIndex = stringArrayList.size() - 1;
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (i == startIndex) {
                System.out.println(stringArrayList.get(i));
            } else if (i == lastIndex) {
                System.out.println(stringArrayList.get(i));
            }
        }
    }

    public static void generateIndexOutOfBounds() {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(integerArrayList.get(3));
    }

    public static void secondPlusThird(Scanner sc) {
        ArrayList<Integer> intList = new ArrayList<>();
        int result = 0;

        while (true) {
            System.out.print("Enter the numbers you want to add to list: ");
            int userNum = sc.nextInt();
            if (userNum == 0) {
                sc.close();
                result = intList.get(1) + intList.get(2);
                break;

            }
            intList.add(userNum);
        }
        System.out.println(result);
    }

    public static void thirdElementExercise(Scanner sc) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        while (true) {
            System.out.println("Enter the string you want to add to the String ArrayList: ");
            String textToBeStored = sc.nextLine();

            if (textToBeStored.matches("")) {
                sc.close();
                break;
            }
            stringArrayList.add(textToBeStored);

        }
        System.out.println(stringArrayList.get(2));

    }

}
