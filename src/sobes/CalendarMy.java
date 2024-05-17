package sobes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarMy {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("=========================================");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2015, Calendar.FEBRUARY,1);
        System.out.println(calendar1.getActualMaximum(Calendar.DAY_OF_MONTH)==29);

        System.out.println("============================================================");


        Date date = new Date();
        System.out.println(date);

        System.out.println(dateFormatter(date));

    }
    public static String dateFormatter(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM в H:mm"/*, Locale.ENGLISH*/);
        return dateFormat.format(date);
    }
}
