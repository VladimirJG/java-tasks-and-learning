package java_rush.array;

import java.util.Arrays;

public class Lesson5ComparisonOf2DArrays {

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        if (Arrays.deepEquals(arrayFirst, arraySecond)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
