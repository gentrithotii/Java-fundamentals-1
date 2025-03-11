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
        firstAndLastInTheList(userInput);


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
        integerArrayList.get(3);
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
