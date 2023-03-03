package java_rush.array;

import java.util.Arrays;

public class Lesson5CreateAMultiArray {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int x = 0; x < multiArray[i][j].length; x++) {
                    System.out.print(Arrays.toString(new int[]{multiArray[i][j][x]}));
                }
                //System.out.println();
            }
        }
    }
    // запись через форич
   /* for (int[][] ints : multiArray) {
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(Arrays.toString(new int[]{i}));*/
}
