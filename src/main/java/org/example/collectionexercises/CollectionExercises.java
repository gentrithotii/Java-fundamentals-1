package org.example.collectionexercises;

import com.sun.source.doctree.InlineTagTree;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {

//        firstExercise();
//        secondExercise();
//        thirdExercise();
//        fourthExercise();
//        fifthExercise();
//        sixthExercise();
//        seventhExercise();
//        eightExercise();
//        ninthExercise();
//        tenthExercise();
//        eleventhExercise();
//        twelveExercise();
        challengeExerciseOne();

    }

    public static void challengeExerciseOne() {
        Set<String> dayOfWeek = getDayOfWeek();
        Set<String> weekDays = new HashSet<>();
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        dayOfWeek.retainAll(weekDays);

        System.out.println(dayOfWeek);

    }

    public static void twelveExercise() {
        Map<Integer, CarExerciseTwelve> carExerciseTwelveMap = new HashMap<>();
        carExerciseTwelveMap.put(1, new CarExerciseTwelve("BMW", "M5"));
        carExerciseTwelveMap.put(2, new CarExerciseTwelve("Porsche", "GT2RS"));
        carExerciseTwelveMap.put(3, new CarExerciseTwelve("Audi", "RS6"));
        carExerciseTwelveMap.put(4, new CarExerciseTwelve("Toyota", "Supra"));
        carExerciseTwelveMap.put(5, new CarExerciseTwelve("Nissan", "GTR"));

        for (Integer i : carExerciseTwelveMap.keySet()) {
            System.out.println("Car brands: " + carExerciseTwelveMap.get(i).getModel());
        }
    }

    public static void eleventhExercise() {
        Map<Integer, String> carHashMap = getCarHashMap();

        for (Integer things : carHashMap.keySet()) {
            System.out.println(carHashMap.get(things));
        }
    }

    public static void tenthExercise() {
        Map<Integer, String> carHashMap = getCarHashMap();
        for (Integer i : carHashMap.keySet()) {
            System.out.println(i);
        }
    }

    public static void ninthExercise() {
        Map<Integer, String> carHashMap = getCarHashMap();

        System.out.println(carHashMap);
    }

    public static void eightExercise() {
        Set<String> randomNames = getRandomNames();

        Set<String> treSeet = new TreeSet<>(randomNames);

        for (String names : treSeet) {
            System.out.println(names);
        }
    }

    public static void seventhExercise() {
        Set<String> namesHashSet = getRandomNames();

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

    public static void sixthExercise() {
        Set<String> hashDaysOfWeek = getDayOfWeek();

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

    public static void fifthExercise() {
        Set<String> hashDaysOfWeek = getDayOfWeek();

        for (String hashWeekDay : hashDaysOfWeek) {
            System.out.println(hashWeekDay);
        }
    }

    public static void fourthExercise() {
        List<String> daysOfWeek = new ArrayList<>(getDayOfWeek());

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

    public static void secondExercise() {
        List<String> daysOfWeek = new ArrayList<>(getDayOfWeek());

        for (String s : daysOfWeek) {
            System.out.println(s);
        }
    }


    public static void firstExercise() {
        List<String> daysOfWeek = new ArrayList<>(getDayOfWeek());

        for (String s : daysOfWeek) {
            System.out.println(s);
        }
    }

    private static Set<String> getRandomNames() {
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
        return namesHashSet;
    }

    private static Set<String> getDayOfWeek() {
        Set<String> hashDaysOfWeek = new HashSet<>();
        hashDaysOfWeek.add("Monday");
        hashDaysOfWeek.add("Tuesday");
        hashDaysOfWeek.add("Wednesday");
        hashDaysOfWeek.add("Thursday");
        hashDaysOfWeek.add("Friday");
        hashDaysOfWeek.add("Saturday");
        hashDaysOfWeek.add("Sunday");
        return hashDaysOfWeek;
    }

    public static Map<Integer, String> getCarHashMap() {
        Map<Integer, String> carHashMap = new HashMap<>();
        carHashMap.put(1, "BMW");
        carHashMap.put(2, "Porsche");
        carHashMap.put(3, "Audi");
        carHashMap.put(4, "Mercedes");
        carHashMap.put(5, "Toyota");

        return carHashMap;
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
