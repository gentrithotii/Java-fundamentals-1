package org.example;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        printText(userInput);
        printUntilNumber(2);
        System.out.println("");
        printFromNumberToOne(6);
    }


    public static void printUntilNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void printText(Scanner sc) {
        System.out.println("Enter the number of times you want to print the text");
        int userInput = sc.nextInt();

        for (int i = 1; i <= userInput; i++) {
            System.out.println("In a hole in the ground there lived a method");
        }
    }

    public static void printFromNumberToOne(int num){
        for(int i = num; i >= 1; i--){
            System.out.println(i);
        }
    }
}
