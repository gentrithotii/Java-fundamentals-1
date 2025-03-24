package org.example.JavaExercisesmooc.MoocParts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3, 2, 6, -1, 5, 1));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("First", "Second", "Third"));
        int[] numArray = new int[]{5, 1, 3, 4, 2};
//        thirdElementExercise(userInput);
//        secondPlusThird(userInput);
//        generateIndexOutOfBounds();
//        firstAndLastInTheList(userInput);
//        rememberTheseNumbers(userInput);
//        greatestInList(userInput);
//        indexOfNumList(userInput);
//        indexOfSmallestNum(userInput);
//        sumAListAndAverage(userInput);
//        findStringOnList(userInput);
//        printNumbersInRange(numList, 3, 10);
//        int sum = sum(numList);
//        removeLast(stringList);
//        swapAtGivenIndices(numArray, userInput);
//        checkIfNumExists(numArray, userInput);
//        System.out.println(sumOfNumbersInArray(numArray));
//        printNeatly(numArray);
//        printArrayInStars(numArray);
//        printThrice(userInput);
//        isItTrue(userInput);
//        logInUser(userInput);
//        lineByLine(userInput);
//        firstWordPrint(userInput);
//        lastWordPrint(userInput);
//        ageOfTheOldest(userInput);
        personalDetails(userInput);

    }

    public static void personalDetails(Scanner sc) {
        int count = 0;
        double average = 0;
        String longestName = " ";

        while (true) {
            System.out.print("Enter words you want to print the last string: ");
            String userInput = sc.nextLine();
            String[] splitUserInput = userInput.split(",");

            if (userInput.isEmpty()) {
                break;
            }

            String currentUserName = splitUserInput[0];
            int age = Integer.parseInt(splitUserInput[1]);

            if (currentUserName.length() > longestName.length()) {
                longestName = currentUserName;
            }
            count++;
            average = (average + age);
            System.out.println(average);
        }
        average = average / count;
        System.out.println("The longest name is: " + longestName + " Average age is:  " + average);
    }

    public static void ageOfTheOldest(Scanner sc) {
        int oldestAge = 0;
        String nameOfOldest = "";
        while (true) {
            System.out.print("Enter words you want to print the last string: ");
            String userInput = sc.nextLine();
            String[] splitUserInput = userInput.split(",");

            if (userInput.isEmpty()) {
                break;
            }
            String name = splitUserInput[0];
            int age = Integer.parseInt(splitUserInput[1].trim());

            if (age > oldestAge) {
                oldestAge = age;
                nameOfOldest = name;
            }


        }

        System.out.println("The oldest age: " + oldestAge + " and the name is: " + nameOfOldest);
    }

    public static void lastWordPrint(Scanner sc) {

        while (true) {
            System.out.print("Enter words you want to print the last string: ");
            String userInput = sc.nextLine();
            String[] splitUserInput = userInput.split(" ");

            if (userInput.isEmpty()) {
                break;
            }

            for (int i = 0; i < splitUserInput.length; i++) {
                if (splitUserInput[i] == splitUserInput[splitUserInput.length - 1]) {
                    System.out.println(splitUserInput[i]);
                }
            }
        }
    }

    public static void firstWordPrint(Scanner sc) {
        while (true) {
            System.out.print("Enter a long word to get onle the first one: ");
            String userInput = sc.nextLine();
            String[] splitUserInput = userInput.split(" ");
            if (userInput.isEmpty()) {
                break;
            }

            for (int i = 0; i < splitUserInput.length; i++) {
                if (i == 0) {
                    System.out.println(splitUserInput[i]);
                }
            }
        }
    }

    public static void lineByLine(Scanner sc) {
        String[] splitUserText;
        while (true) {
            System.out.print("Enter text that is gone be split by white space keep empty if you want to stop: ");
            String userInput = sc.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            splitUserText = userInput.split(" ");

            for (int i = 0; i < splitUserText.length; i++) {
                if (splitUserText[i].contains("av")) {
                    System.out.println(splitUserText[i]);
                }
            }
        }

    }

    public static void logInUser(Scanner sc) {
        String user1 = "alex";
        String user2 = "emma";
        String user1Password = "sunshine";
        String user2Password = "haskell";

        System.out.print("Enter username: ");
        String userInput = sc.nextLine();
        System.out.print("Enter password: ");
        String userInputPassword = sc.nextLine();

        if (user1.equals(userInput) && user1Password.equals(userInputPassword) || user2.equals(userInput) && user2Password.equals(userInputPassword)) {
            System.out.print("You have successfully logged in!");
        } else {
            System.out.print("Incorrect username or password! ");
        }
    }

    public static void isItTrue(Scanner sc) {
        System.out.print("Give a string: ");
        String userInput = sc.nextLine();
        userInput = userInput.equals("true") ? "You got it right. " : "Try again! ";

        System.out.println(userInput);
    }

    public static void printThrice(Scanner userInput) {
        //Without loop
        System.out.print("Enter the string you want to print 3 times: ");
        String userText = userInput.nextLine();
        System.out.println(userText + userText + userText);
    }

    public static void printArrayInStars(int[] numArray) {

        for (int i = 0; i < numArray.length; i++) {
            printStars(numArray[i]);
        }
    }

    public static void printStars(int numberOfStars) {
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
    }

    public static int sumOfNumbersInArray(int[] numberArray) {
        int sum = 0;
        for (int i = 0; i < numberArray.length; i++) {
            sum += numberArray[i];
        }
        return sum;
    }

    public static void checkIfNumExists(int[] numArray, Scanner sc) {
        boolean userNumFound = false;
        System.out.print("Enter the number that your looking for in the array: ");
        int userInput = sc.nextInt();

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == userInput) {
                System.out.println(userInput + " found at index of " + i);
                userNumFound = true;
            }
        }
        if (!userNumFound) {
            System.out.println(userInput + " was not found.");
        }
    }

    public static void swapAtGivenIndices(int[] numArray, Scanner sc) {
        for (int j : numArray) {
            System.out.println(j);
        }

        System.out.print("Give two indices to swap: ");
        int indiceOne = sc.nextInt();
        int indiceTwo = sc.nextInt();

        int helper = numArray[indiceOne];
        numArray[indiceOne] = numArray[indiceTwo];
        numArray[indiceTwo] = helper;

        for (int j : numArray) {
            System.out.println(j);
        }


    }

    public static void removeLast(ArrayList<String> strList) {
        strList.remove(strList.size() - 1);
    }

    public static int sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
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
