package org.example.collectionexercises;

import java.time.LocalDate;
import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {

//        firstExercise();
//        seconExecise();
//        thirdExercise();
//        fourthExercise();
//        fifthExercise();
//        sixthExercise();
        seventhExercise();
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

    public static void fifthExercise() {
        Set<String> hashDaysOfWeek = new HashSet<>();
        hashDaysOfWeek.add("Monday");
        hashDaysOfWeek.add("Tuesday");
        hashDaysOfWeek.add("Wednesday");
        hashDaysOfWeek.add("Thursday");
        hashDaysOfWeek.add("Friday");
        hashDaysOfWeek.add("Saturday");
        hashDaysOfWeek.add("Sunday");

        for (String hashWeekDay : hashDaysOfWeek) {
            System.out.println(hashWeekDay);
        }
    }

    public static void sixthExercise() {
        Set<String> hashDaysOfWeek = new HashSet<>();
        hashDaysOfWeek.add("Monday");
        hashDaysOfWeek.add("Tuesday");
        hashDaysOfWeek.add("Wednesday");
        hashDaysOfWeek.add("Thursday");
        hashDaysOfWeek.add("Friday");
        hashDaysOfWeek.add("Saturday");
        hashDaysOfWeek.add("Sunday");

        for (String hashWeekDay : hashDaysOfWeek) {
            System.out.println(hashWeekDay);
        }
        System.out.println(" ");
//        List<String> convertedFromHash = new ArrayList<>(hashDaysOfWeek);

        List<String> convertedFromHash = new ArrayList<>(hashDaysOfWeek);
        convertedFromHash.addAll(hashDaysOfWeek);

        for (String items : convertedFromHash) {
            System.out.println(items);
        }
    }

    public static void seventhExercise() {
        Set<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Gentrit");
        namesHashSet.add("Angel");
        namesHashSet.add("Integra");
        namesHashSet.add("Qupakabra");
        namesHashSet.add("Aurela");
        namesHashSet.add("Benedict");
        namesHashSet.add("Elaine");
        namesHashSet.add("Isak");
        namesHashSet.add("Kalludra");
        namesHashSet.add("Zanzi");
        namesHashSet.add("Xavier");
        namesHashSet.add("Luan");
        namesHashSet.add("Test");

        for (String name : namesHashSet) {
            System.out.println(name);
        }

        List<String> arrayListNames = new ArrayList<>(namesHashSet);
        sortList(arrayListNames);

        System.out.println(" ");
        System.out.println(" ");
        for (String name : arrayListNames) {
            System.out.println(name);
        }
    }


    public static void sortList(List<String> list) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).charAt(0) > list.get(i + 1).charAt(0)) {
                    String temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
    }


}
