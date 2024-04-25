package java_rush.lesson8_data;

import java.util.Date;

public class L4DataTime {
    public static void main(String[] args) throws InterruptedException {
        //Получение текущей даты:
       /* date_my today = new date_my();
        System.out.println("Current date: " + today);*/

        //Вычисление разницы между двумя датами:


       /* date_my currentTime = new date_my();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        date_my newTime = new date_my();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");*/


        //Наступило ли уже некоторое время:
       /* date_my startTime = new date_my();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        date_my endDate = new date_my(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        date_my currentTime = new date_my();
        if (currentTime.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }*/

        //Сколько прошло времени с начала сегодняшнего дня:
       /* date_my currentTime = new date_my();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);*/

        //Сколько дней прошло с начала года:
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
    }
}
