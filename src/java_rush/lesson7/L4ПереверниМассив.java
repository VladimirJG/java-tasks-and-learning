package java_rush.lesson7;

import java.util.Scanner;

//1. Создать массив на 10 чисел.
//2. Ввести с клавиатуры 10 чисел и записать их в массив.
//3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
public class L4ПереверниМассив {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = console.nextInt();
        }
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }
}
