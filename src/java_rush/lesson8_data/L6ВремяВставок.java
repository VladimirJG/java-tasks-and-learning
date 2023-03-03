package java_rush.lesson8_data;
//Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
//Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class L6ВремяВставок {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date start = new Date();
        insert10000(list);

        // напишите тут ваш код
        Date end = new Date();
        return end.getTime() - start.getTime();//вычисляем разницу

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
