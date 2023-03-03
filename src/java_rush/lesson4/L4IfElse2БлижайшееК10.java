package java_rush.lesson4;

/*Напиши метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел,
        записанных в аргументах метода.
        Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10,
        то вывести на экран любое из них.
        Подсказка:
        используй метод public static int abs(int a), который возвращает абсолютную величину числа.*/
public class L4IfElse2БлижайшееК10 {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        // 1 вариант без abs
        /*if (10 - a > b - 10) {
            System.out.println(b);
        } else if (10 - a == b - 10) {
            System.out.println(a + " " + b);
        }else {
            System.out.println(a);
        }*/
        //2 вариант
       /* if(abs(10 -a) > abs(b - 10)){
            System.out.println(b);
        } else if (abs(10 - a) == abs(b - 10)) {
            System.out.println(a|b);
        }else {
            System.out.println(a);
        }*/
        // 3 вариант JR
        System.out.println(abs(a - 10) <= abs(b - 10) ? a : b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
