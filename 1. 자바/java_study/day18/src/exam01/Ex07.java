package exam01;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        Month month = date1.getMonth();
        System.out.printf("English : %s%n", month.getDisplayName(TextStyle.FULL, Locale.JAPAN));
        System.out.printf("English : %s%n", month.getDisplayName(TextStyle.NARROW, Locale.JAPAN));
        System.out.printf("English : %s%n", month.getDisplayName(TextStyle.SHORT, Locale.JAPAN));
    }
}
