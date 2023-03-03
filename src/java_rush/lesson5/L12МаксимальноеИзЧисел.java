package java_rush.lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Написать программу, которая:
//1. считывает с консоли число N, которое должно быть больше 0
//2. потом считывает N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел.
public class L12МаксимальноеИзЧисел {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        if (n != 0) {
            for (int j = 0; j < n; j++) {
                int i = Integer.parseInt(reader.readLine());
                if (i > maximum) {
                    maximum = i;
                }
            }
            System.out.println(maximum);
        }
    }
}