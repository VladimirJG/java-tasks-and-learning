package java_rush.lesson7;

import java.util.Arrays;
import java.util.Scanner;

//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
// вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
public class L4ОдинБольшойМассивИДваМаленьких {
    public static void main(String[] args) {
        int[] bigArray = new int[20];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = console.nextInt();
        }
        int[] minArray1 = new int[10];
        int[] minArray2 = new int[10];
        minArray1 = Arrays.copyOfRange(bigArray, 0, bigArray.length/2 );
        minArray2 = Arrays.copyOfRange(bigArray, bigArray.length/2 , bigArray.length);
        System.out.println(Arrays.toString(minArray1));
        System.out.println(Arrays.toString(minArray2));

        for (int i = 0; i < minArray2.length; i++) {
            System.out.println(minArray2[i]);
        }
    }
}


