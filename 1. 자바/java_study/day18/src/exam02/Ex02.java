package exam02;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex02 {
    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.now();
        ZonedDateTime zonedDateTime1 = datetime1.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime1);
    }
}
