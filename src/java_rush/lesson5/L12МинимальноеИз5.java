package java_rush.lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Текущая реализация: Программа считывает два числа с клавиатуры и выводит минимальное из них на экран.
//Новая задача: Программа считывает пять чисел с клавиатуры и выводит минимальное из них на экран.
public class L12МинимальноеИз5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(min(min(a, b), min(c, d)), e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
// int minimum = min(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
//
//        System.out.println("Minimum = " + minimum);
//    }
//
//    public static int min(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
//        return min(min(firstNumber, secondNumber), min(min(thirdNumber, fourthNumber), fifthNumber));
//    }
//
//    public static int min(int firstNumber, int secondNumber) {
//        return firstNumber < secondNumber ? firstNumber : secondNumber;
//    }
