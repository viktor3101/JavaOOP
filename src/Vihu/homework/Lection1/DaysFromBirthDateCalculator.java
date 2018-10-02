package Vihu.homework.Lection1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysFromBirthDateCalculator {

    public static int Int(char c, int k) {
        return Character.getNumericValue(c) * k;
    }

    public static int Int(char c) {
        return Character.getNumericValue(c);
    }

    public static long daysFromBirthDate(String birthDateString) {
        char[] c = birthDateString.toCharArray();
        int year = Int(c[0], 1000) + Int(c[1], 100) + Int(c[2], 10) + Int(c[3]);
        int month = Int(c[5], 10) + Int(c[6]);
        int day = Int(c[8], 10) + Int(c[9]);
        LocalDate k = LocalDate.now()
                .minusDays(day)
                .minusMonths(month)
                .minusYears(year);
        return ChronoUnit.DAYS.between(LocalDate.now(), k);
    }


    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1972-12-28"));
        System.out.println(daysFromBirthDate("2005-05-01"));
    }
}
