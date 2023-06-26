package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dateTime1 = date.atTime(time);
        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
        LocalDateTime dateTime3 = time.atDate(date);

        System.out.println("dateTime1 : " + dateTime1);
        System.out.println("dateTime2 : " + dateTime2);
        System.out.println("dateTime3 : " + dateTime3);
    }
}
