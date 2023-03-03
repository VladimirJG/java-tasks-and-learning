package java_rush.lesson4;
/*Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна
        пара равных между собой чисел.
        Если такая пара существует, вывести на экран числа через пробел.
        Если все три числа равны между собой, то вывести все три.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4СуществуетЛиПара {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b && b == c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a == c) {
            System.out.println(a + ", " + c);
        } else if (c == b) {
            System.out.println(b + ", " + c);
        } else {
            System.out.println(a + ", " + b);
        }
    }
}