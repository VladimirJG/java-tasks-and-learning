package java_rush.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
public class L11ЧислаПоВозрастанию {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       /* int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            array[i] = num;
        }
        int[] newArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            int max = Math.max(Math.max(Math.max(array[0], array[1]), Math.max(array[2], array[3])), array[4]);
            newArray[i] = max;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == max) {
                    array[j] = 0;
                }
            }
        }
        for (int i = newArray.length -1; i >= 0; i--) {
            System.out.println(newArray[i]);
        }*/

//2 Вариант. Прошел проверку
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}