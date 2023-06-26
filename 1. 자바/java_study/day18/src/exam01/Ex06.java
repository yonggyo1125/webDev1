package exam01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        DayOfWeek dayOfWeek = date1.getDayOfWeek();
        System.out.printf("English : %s%n", dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
        System.out.printf("English : %s%n", dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.US));
        System.out.printf("English : %s%n", dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US));

        System.out.printf("China : %s%n", dayOfWeek.getDisplayName(TextStyle.FULL, Locale.CHINA));
        System.out.printf("China : %s%n", dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.CHINA));
        System.out.printf("China : %s%n", dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.CHINA));
    }
}
