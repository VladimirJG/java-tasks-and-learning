package new_pack;

import java.time.LocalDate;

public class LD {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        /*DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.println(localDate.format(DATE_FORMATTER));*/
        System.out.println(Integer.parseInt(String.valueOf(localDate.getMonth())));
        System.out.println(localDate.getYear());
    }
}
