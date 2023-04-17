package cs50;


import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {0, 1, 2, 3, 7};
        fillArray(arr1, arr2);

    }

    public static int[] fillArray(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            if (i >= a.length - 1) {
                c[i] = b[i];
            } else if (i >= b.length - 1) {
                c[i] = a[i];
            } else {
                c[i] = Math.min(a[i], b[i]);
                c[i + 1] = Math.max(a[i], b[i]);
            }
        }
        System.out.println(Arrays.toString(c));
        return c;
    }
}
