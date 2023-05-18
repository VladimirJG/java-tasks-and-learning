package cs50;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = {2, 17, 56, 5, 14, 398, 75, 43, 20, 6, 121, 37};
        int n = 6;
        System.out.println(binaryS(n, array));
    }

    public static int binaryS(int n, int array[]) {
        Arrays.sort(array);
        int[] newArr= new int[array.length/2];
        if (array.length / 2 == n || array.length / 2 + 1 == n) {
            return n;
        } else if (array.length / 2 > n) {

        }
        return 0;
    }
}
