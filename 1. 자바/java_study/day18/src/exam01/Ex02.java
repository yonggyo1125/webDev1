package exam01;

import java.util.Calendar;

import static java.util.Calendar.*;
import static java.util.Calendar.SECOND;

public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //cal.add(DAY_OF_MONTH, 100);
        //showDate(cal); // 2023-9-15 19:28:23

        cal.roll(DAY_OF_MONTH, 100); // 2023-6-17 19:29:11
        showDate(cal);
    }

    private static void showDate(Calendar cal) {
        int year = cal.get(YEAR);
        int month = cal.get(MONTH);// 0 ~ 11
        int day = cal.get(DAY_OF_MONTH);

        int hour = cal.get(HOUR_OF_DAY); // HOUR - 12, HOUR_OF_DAY : 24
        int minute = cal.get(MINUTE);
        int second = cal.get(SECOND);

        System.out.printf("%d-%d-%d %d:%d:%d%n", year, month + 1, day, hour, minute, second);
    }
}
