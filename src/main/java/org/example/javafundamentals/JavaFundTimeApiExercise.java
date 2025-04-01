package org.example.javafundamentals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaFundTimeApiExercise {
    public static void main(String[] args) {
        //Exercise 1 && 2
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd EEEE, yyyy");
        String text = todayDate.format(formatter);
        System.out.println(text);

        System.out.println("---------------------------------------");

        //Exercise 3
        LocalDate nowDate = LocalDate.now();
        LocalDate lastMonday = nowDate.minusDays(7);
        long getAmountOfDay = nowDate.getDayOfMonth() - lastMonday.getDayOfMonth();

        DateTimeFormatter formater = DateTimeFormatter.ISO_DATE;

        for (int i = 1; i <= getAmountOfDay; i++) {
            lastMonday = lastMonday.plusDays(1);
            System.out.println(lastMonday.format(formater));
        }

        System.out.println("---------------------------------------");


        //Exercise 4 && 5
        String stringLocalDate = "1994-10-24";
        LocalDate gentritBirthDate = LocalDate.parse(stringLocalDate);
        String testFormat = gentritBirthDate.format(formatter);

        System.out.println(gentritBirthDate);
        System.out.println(testFormat);

        System.out.println("---------------------------------------");

        //Exercise 6
        LocalDate currentDate = LocalDate.now();
        currentDate = currentDate.plusYears(10).minusMonths(10);
        DateTimeFormatter formatFun = DateTimeFormatter.ofPattern("yyyy, MMMM dd EEEE");
        String textedMonth = currentDate.format(formatFun);
        System.out.println(textedMonth);

        System.out.println("---------------------------------------");

        //Exercise 7
        Period period = Period.between(gentritBirthDate, currentDate);
        System.out.println("Amount of years elapsed: " + period.getYears() + " | " + " Amount of Months: " + period.getMonths() + " | " + " Amount of days: " + period.getDays());

        System.out.println("---------------------------------------");

        //Exercise 8
        Period periodToBeAdded = Period.of(4, 7, 29);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy, MMMM dd EEEE");
        String formatedDate = todayDate.plusYears(periodToBeAdded.getYears()).plusMonths(periodToBeAdded.getMonths()).plusDays(periodToBeAdded.getDays()).format(format2);
        System.out.println(formatedDate);

        System.out.println("---------------------------------------");

        //Exercise 9
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time: " + localTime);

        System.out.println("---------------------------------------");

        //Exercise 10
        System.out.println("Nano seconds: " + localTime.getNano());

        System.out.println("---------------------------------------");

        //Exercise 11
        String stringTimeToBeConverted = "16:32:21";
        LocalTime stringConvertedTime = LocalTime.parse(stringTimeToBeConverted);
        System.out.println("The Converted time is : " + stringConvertedTime);

        System.out.println("---------------------------------------");

        //Exercise 12
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String stringTime = localTime.format(timeFormatter);
        System.out.println("Formated current time: " + stringTime);

        System.out.println("---------------------------------------");

        //Exercise 13
        LocalDateTime fullDateTime = LocalDateTime.of(2018, 4, 5, 10, 0);
        System.out.println("Full date and time: " + fullDateTime);

        System.out.println("---------------------------------------");

        //Exercise 14
        DateTimeFormatter forFullDateTime = DateTimeFormatter.ofPattern("eeee d MMMM HH:mm");
        String formatedFullDateTime = fullDateTime.format(forFullDateTime);
        System.out.println(formatedFullDateTime);

        System.out.println("---------------------------------------");

        //Exercise 15 && 16
        LocalDate onlyLocalDate = LocalDate.now();
        LocalTime onlyLocalTime = LocalTime.now();
        LocalDateTime combinedDateTime = LocalDateTime.of(onlyLocalDate, onlyLocalTime);
        System.out.println("Combined Local Date with Local Time: " + combinedDateTime);

        System.out.println("---------------------------------------");

        LocalDateTime toBeSplitDateTime = LocalDateTime.of(1994, 10, 24, 21, 15);
        LocalTime newTime = LocalTime.of(toBeSplitDateTime.getHour(), toBeSplitDateTime.getMinute(), toBeSplitDateTime.getSecond());
        LocalDate newDate = LocalDate.of(toBeSplitDateTime.getYear(), toBeSplitDateTime.getMonth(), toBeSplitDateTime.getDayOfMonth());

        System.out.println("LocalDateTime before split: " + toBeSplitDateTime);
        System.out.println("New Time: " + newTime);
        System.out.println("New Date: " + newDate);

        System.out.println("---------------------------------------");

        //Exercise 17


    }
}
