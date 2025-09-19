package org.example.JavaExercisesmooc.moocparts;

import java.util.Scanner;

public class Part8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        returnCubeOfNumber(sc);
        averageOfPositiveNumbers(sc);
    }

    public static void averageOfPositiveNumbers(Scanner sc) {
        double sum = 0, positiveNumber = 0;

        while (true) {
            System.out.print("Enter positive number: ");
            int userInput = sc.nextInt();

            if (userInput == 0) {
                break;

            }
            if (userInput > 0) {
                positiveNumber++;
                sum += userInput;
            }

        }
        if (positiveNumber == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double result = sum / positiveNumber;
            System.out.println(result);
        }
    }

    public static void returnCubeOfNumber(Scanner sc) {
        int result = 0;
        while (true) {
            System.out.print("Enter number typing end will quit : ");
            String userInput = sc.nextLine();
            if (userInput.equals("end")) {
                break;
            } else {
                int numberConverted = Integer.parseInt(userInput);
                result = numberConverted * numberConverted * numberConverted;
                System.out.println(result);
            }

        }
    }
}
