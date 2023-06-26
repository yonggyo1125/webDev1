package exam02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex03 {
    public static void main(String[] args) {
        String[] timeZones = {"Asia/Seoul", "Asia/Manila", "Asia/Jakarta", "America/New_York"};
        for (String timezone : timeZones) {
            ZoneId zId = ZoneId.of(timezone);
            ZonedDateTime zonedDateTime = ZonedDateTime.now().withZoneSameInstant(zId);

            System.out.println(zonedDateTime);
        }
    }
}
