package java_rush.lesson2;
/*Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius (в методе printCircleLength).
        Результат - дробное число (тип double).
        В качестве значения Pi используй значение 3.14.*/
public class L2L4Circumference {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double length = 2 * 3.14 * radius;
        System.out.println(length);
    }
}
