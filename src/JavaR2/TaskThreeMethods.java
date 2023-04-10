package JavaR2;

import java.util.Arrays;

//Напиши public static методы: int max(int, int), long max(long, long), double max(double, double).
//Каждый метод должен возвращать максимальное из двух переданных в него чисел.
public class TaskThreeMethods {
    public static void main(String[] args) {
        System.out.println(num(5,12));
        System.out.println(maxDouble(5.3,5.5));
        System.out.println(maxLong(566899744,126555151));
    }

    //Напишите тут ваши методы
    public static int num(int a, int b) {
        return Math.max(a, b);
    }

    public static long maxLong(long a, long b) {
        return Math.max(a, b);
    }

    public static double maxDouble(double a, double b) {
        return Math.max(a, b);
    }
}
