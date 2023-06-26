package exam01;

import java.time.LocalDate;
import static java.time.temporal.ChronoField.*;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

        //int year = date1.get(YEAR);
        int year = date1.getYear();
        //int month = date1.get(MONTH_OF_YEAR);
        int month = date1.getMonthValue();
        //int day = date1.get(DAY_OF_MONTH);
        int day = date1.getDayOfMonth();

        System.out.printf("%d-%d-%d%n", year, month, day);
    }
}
