package java_rush.lesson5;
//Вывести на экран текущую дату в аналогичном виде "21 02 2014".
import java.text.SimpleDateFormat;
import java.util.Date;

public class L12ТекущаяДата {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
