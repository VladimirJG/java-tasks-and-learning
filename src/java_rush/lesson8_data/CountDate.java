package java_rush.lesson8_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудь учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
 */
public class CountDate {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 1 2000"));

    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(simpleDateFormat.parse(date));
        int days = calendar.get(Calendar.DAY_OF_YEAR);
        return days % 2 != 0;
    }
}
