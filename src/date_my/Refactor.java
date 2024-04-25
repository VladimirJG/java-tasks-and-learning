package date_my;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Refactor {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Instant instant = date.toInstant();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);

        LocalDate localDate1 = instant.atZone(ZoneId.of("Europe/Paris")).toLocalDate();
        System.out.println(localDate1);
    }
}
