package org.example.JavaFundamentals;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaFundTimeApiExercize {
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

    }
}
