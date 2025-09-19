package org.example.JavaExercisesmooc.moocparts;

import java.util.Scanner;

public class Part8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        returnCubeOfNumber(sc);

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
