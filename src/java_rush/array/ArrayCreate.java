package java_rush.array;

import java.util.Scanner;

public class ArrayCreate {
    public static void main(String[] args) {


        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = i + 1;
        }
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = 10 - i;
        }
        Scanner console = new Scanner(System.in);
        int[] array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            array3[i] = console.nextInt();
        }
    }
}