package org.example.JavaExercisesmooc.moocparts;

import java.nio.file.Paths;
import java.util.Scanner;

public class Part4FilesAndData {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


//        numberOfString(userInput);
//        cubes(userInput);
        printingAFile();
    }

    public static void printingAFile() {
        try (Scanner sc = new Scanner(Paths.get("/data.txt"))) {

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void cubes(Scanner sc) {

        while (true) {
            System.out.print("Enter the number you want to Cube: ");
            String userInput = sc.nextLine();

            if (userInput.equals("end")) {
                break;
            }

            int userNumber = Integer.parseInt(userInput);
            System.out.println(cubeNumber(userNumber));
        }
    }

    public static int cubeNumber(int a) {
        return a * a * a;
    }

    public static void numberOfString(Scanner sc) {
        int stringCounter = 0;

        while (true) {

            System.out.print("Enter strings they will be counted: ");
            String userInput = sc.nextLine();


            if (userInput.equals("end")) {
                break;
            }

            stringCounter++;
        }

        System.out.println(stringCounter);
    }
}
