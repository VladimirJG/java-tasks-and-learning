package java_rush.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lesson4Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            int[] array = new int[number];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            if (number % 2 == 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    System.out.println(array[i]);
                }
            } else {
                for (int j : array) {
                    System.out.println(j);
                }
            }
        }
        //Читаем число с клавиатуры и сохраняем его в очередную ячейку массива
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }
        //код, который найдет в массиве минимальный элемент и выведет его на экран
        Scanner console1 = new Scanner(System.in);
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = console1.nextInt();
        }
        int min = array1[0];

        for (int i = 1; i < 10; i++) {
            if (array1[i] < min)

                min = array1[i];
        }
        System.out.println(min);
    }

}

