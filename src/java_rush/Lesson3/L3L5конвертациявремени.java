package java_rush.Lesson3;
/*Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
        Вызови его дважды в методе main с любыми параметрами.
        Результаты выведи на экран, каждый раз с новой строки.*/
public class L3L5конвертациявремени {
    public static int convertToSeconds(int hour){
        int sec = hour * 3600;
        return sec;

        //РешениеJR return hour * 60 * 60;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(3));

    }
}
