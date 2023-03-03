package java_rush.array;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Lesson5FindingAnElement {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        int index = Arrays.binarySearch(newArray, element);
        if (index >= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}


