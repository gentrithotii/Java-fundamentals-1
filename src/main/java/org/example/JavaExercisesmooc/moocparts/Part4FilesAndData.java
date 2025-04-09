package org.example.JavaExercisesmooc.moocparts;

import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Part4FilesAndData {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


//        numberOfString(userInput);
//        cubes(userInput);
//        printSpecifiedFile(userInput);
        guestListFromFile(userInput);
    }

    public static void guestListFromFile(Scanner sc) {
        System.out.print("Enter the file name: ");
        String userFileName = sc.nextLine();

        while (true) {
            System.out.print("Enter the name you want to find: ");
            String userName = sc.nextLine();
            if (userName.isEmpty()) {
                break;
            }

            boolean isFound = false;

            try (Scanner scReadFile = new Scanner(Paths.get("filesforexercises/" + userFileName))) {
                while (scReadFile.hasNextLine()) {
                    String line = scReadFile.nextLine();
                    if (line.equals(userName)) {
                        isFound = true;
                        break;
                    }
                }
                System.out.println(isFound ? "Item found" : "Not found");

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Thank you");
    }

    public static void printSpecifiedFile(Scanner sc) {
        System.out.print("Enter the file name that you want to read: ");
        String userInput = sc.nextLine();

        printingAFile(userInput);
    }

    public static void printingAFile(String userInput) {
        try (Scanner sc = new Scanner(Paths.get("filesforexercises/" + userInput))) {

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
