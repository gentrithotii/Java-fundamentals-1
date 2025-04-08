package org.example.collectionexercises;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionExercises {
    public static void main(String[] args) {

//        firstExercise();
//        seconExecise();
//        thirdExercise();
        fourthExercise();

    }

    public static void firstExercise() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        for (String s : daysOfWeek) {
            System.out.println(s);
        }
    }

    public static void seconExecise() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        for (int i = 0; i < daysOfWeek.size(); i++) {
            System.out.println(daysOfWeek.get(i));
        }
    }

    public static void thirdExercise() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Thursday");

        for (String weekDays : daysOfWeek) {
            System.out.println(weekDays);
        }
    }

    public static void fourthExercise() {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println("Normal List");
        System.out.println(" ");
        for (String weekDays : daysOfWeek) {
            System.out.println(weekDays);
        }
        System.out.println("--------------------");
        System.out.println("Sublist");
        System.out.println(" ");
        List<String> subList = daysOfWeek.subList(0, 3);

        for (String weekDays : subList) {
            System.out.println(weekDays);
        }
    }
}
