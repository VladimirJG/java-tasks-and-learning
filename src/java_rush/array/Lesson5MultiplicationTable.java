package java_rush.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson5MultiplicationTable {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
      /*  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j] = (j + 1) * (i + 1);
                MULTIPLICATION_TABLE[i] = array;
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }*/
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= MULTIPLICATION_TABLE.length; i++) {
            for (int j = 1; j <= MULTIPLICATION_TABLE.length; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }
}





