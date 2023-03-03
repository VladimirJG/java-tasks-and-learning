package java_rush.lesson7;

import java.io.IOException;
import java.util.Scanner;

//1. В методе initializeArray():
//1.1. Создай массив на 20 чисел
//1.2. Считай с консоли 20 чисел и заполни ими массив
//2. Метод max(int[] array) должен находить максимальное число из элементов массива
//
//Требования:
public class L4МассивныйМаксимум {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int[20];
        //Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
           // array[i] = scanner.nextInt();
            array[i] = i;//19
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maxCurrent = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]> maxCurrent){
                maxCurrent = array[i];
            }
        }
        return maxCurrent;
    }
}
