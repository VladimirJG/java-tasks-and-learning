package cs50;


import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {0, 1, 2, 2, 3, 7};
        fillArray(arr1, arr2);

    }

    public static int[] fillArray(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        for (int i = 0, j = 0; i < Math.max(a.length, b.length); j++, i++) {
            if (i >= a.length ) {
                c[j] = b[i];
            } else if (i >= b.length ) {
                c[j] = a[i];
            } else {
                c[j] = Math.min(a[i], b[i]);
                c[j + 1] = Math.max(a[i], b[i]);
                j++;
            }
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
}