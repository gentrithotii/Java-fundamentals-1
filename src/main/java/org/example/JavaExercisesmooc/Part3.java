package org.example.JavaExercisesmooc;

import java.util.ArrayList;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

//        thirdElementExercise(userInput);
        secondPlusThird(userInput);
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
