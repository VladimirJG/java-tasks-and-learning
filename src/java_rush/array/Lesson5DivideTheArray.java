package java_rush.array;

import java.util.Arrays;

public class Lesson5DivideTheArray {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,};

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            int[] arrayMax;
            int[] arrayMin;
            if (array.length % 2 != 0) {
                arrayMax = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
                arrayMin = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
            } else {
                arrayMax = Arrays.copyOfRange(array, 0, array.length / 2);
                arrayMin = Arrays.copyOfRange(array, array.length / 2, array.length);
            }
            result[0] = arrayMax;
            result[1] = arrayMin;
        }
        System.out.println(Arrays.deepToString(result));
    }
}
