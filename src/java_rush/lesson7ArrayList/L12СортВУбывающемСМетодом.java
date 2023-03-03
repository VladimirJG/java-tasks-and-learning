package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
//
//Требования:
//•	Программа должна считывать 20 целых чисел с клавиатуры.
//•	Программа должна выводить 20 чисел.
//•	В классе Solution должен быть метод public static void sort(int[] array).
//•	Метод main должен вызывать метод sort.
//•	Метод sort должен сортировать переданный массив по убыванию.
public class L12СортВУбывающемСМетодом {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[20];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(reader.readLine());
        }
        sort1(array1);
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.println(array1[i]);
        }
    }
    public static void sort1(int[] array){
        Arrays.sort(array);
    }
}