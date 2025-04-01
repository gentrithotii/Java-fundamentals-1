package org.example.week14exercises.interface_exercise;

import java.util.Scanner;

public interface ICalculatorExercise {
    Scanner sc = new Scanner(System.in);

    double addition();

    double multiplication();

    double division();

    double subtraction();

    static int getUserInput() {
        System.out.println("Enter the Number");
        return sc.nextInt();
    }

    default double calculate() {
        return -1;
    }

}
