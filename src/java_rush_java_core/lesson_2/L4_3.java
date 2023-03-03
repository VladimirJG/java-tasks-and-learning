package java_rush_java_core.lesson_2;

//Напиши public static методы: int min(int, int), long min(long, long), double min(double, double).
//Каждый метод должен возвращать минимальное из двух переданных в него чисел.
//
//Требования:
//•	Программа не должна выводить текст на экран.
//•	Класс Solution должен содержать четыре метода.
//•	Класс Solution должен содержать статический метод int min(int, int).
//•	Метод int min(int, int) должен возвращать минимальное из двух чисел типа int.
//•	Класс Solution должен содержать статический метод long min(long, long).
//•	Метод long min(long, long) должен возвращать минимальное из двух чисел типа long.
//•	Класс Solution должен содержать статический метод double min(double, double).
//•	Метод double min(double, double) должен возвращать минимальное из двух чисел типа double.
public class L4_3 {
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
        //return a < b ? a : b;
    }
    public static long min(long a, long b){
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
    public static double min( double a, double b){
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
