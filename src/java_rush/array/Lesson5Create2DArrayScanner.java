package java_rush.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5Create2DArrayScanner {

    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        multiArray = new int[scanner.nextInt()][];
        for (int i = 0; i < multiArray.length; i++) {
            multiArray[i] = new int[scanner.nextInt()];
        }
    }
}



