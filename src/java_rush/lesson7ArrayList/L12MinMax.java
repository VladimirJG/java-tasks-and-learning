package java_rush.lesson7ArrayList;
//Создать массив на 20 чисел.
//Заполнить его числами с клавиатуры.
//Найти максимальное и минимальное числа в массиве.
//Вывести на экран максимальное и минимальное числа через пробел.
//	В классе Solution создай статический публичный метод int[] getInts().
//•	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class L12MinMax {
    public static void main(String[] args) throws Exception {
        int[] array = getInts();
        Arrays.sort(array);
        int maximum = 0;
        int minimum = 0;
        for (int i = 0; i < array.length; i++) {
            minimum = array[0];
            maximum = array[19];
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return numbers;

    }
}
