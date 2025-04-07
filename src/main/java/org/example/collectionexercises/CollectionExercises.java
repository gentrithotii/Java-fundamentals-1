package org.example.collectionexercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercises {
    public static void main(String[] args) {

//        firstExercise();


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
}
