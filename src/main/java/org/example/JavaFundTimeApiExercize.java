package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class JavaFundTimeApiExercize {
    public static void main(String[] args) {
        //Exercise 1 && 2
        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd EEEE, yyyy");
        String text = todayDate.format(formatter);
        System.out.println(text);

        //Exercise 3
        LocalDate nowDate = LocalDate.now();
        LocalDate lastMonday = nowDate.minusDays(7);
        long getAmountOfDay = nowDate.getDayOfMonth() - lastMonday.getDayOfMonth();

        DateTimeFormatter formater = DateTimeFormatter.ISO_DATE;

        for (int i = 1; i <= getAmountOfDay; i++) {
            lastMonday = lastMonday.plusDays(1);
            System.out.println(lastMonday.format(formater));
        }

        //Exercise 4 && 5
        String stringLocalDate = "1994-10-24";
        LocalDate gentritBirthDate = LocalDate.parse(stringLocalDate);
        String testFormat = gentritBirthDate.format(formatter);

        System.out.println(gentritBirthDate);
        System.out.println(testFormat);

        //Exercise 6
        LocalDate currentDate = LocalDate.now();
        currentDate = currentDate.plusYears(10).minusMonths(10);
        DateTimeFormatter formatFun = DateTimeFormatter.ofPattern("yyyy, MMMM dd EEEE");
        String textedMonth = currentDate.format(formatFun);
        System.out.println(textedMonth);

        //Exercise 7

    }
}
