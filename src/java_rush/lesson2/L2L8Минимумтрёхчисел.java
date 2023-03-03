package java_rush.lesson2;

/*Написать функцию, которая вычисляет минимум из трёх чисел.

        Подсказка:
        Нужно написать тело существующей функции min.*/
public class L2L8Минимумтрёхчисел {
    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return  a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
