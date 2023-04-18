package cs50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8, 10};
        int[] arr2 = {0, 1, 2, 2, 3, 7};
        fillArray(arr1, arr2);

    }

    public static int[] fillArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0, j = 0; i < Math.max(a.length, b.length); i++, j++) {
            if (i >= a.length) {
                c[j] = b[i];
            } else if (i >= b.length) {
                c[j] = a[i];
            } else {
                c[j] = Math.min(a[i], b[i]);
                c[j + 1] = Math.max(a[i], b[i]);
                j++;
            }
        }
        System.out.println(Arrays.toString(c));


        for (int i = 0; i < c.length; i++) {

            for (int i1 = i+1; i1 < c.length; i1++) {
               if (c[i]>c[i1]){
                   int replaceNum = c[i];
                   c[i]=c[i1];
                   c[i1]= replaceNum;
               }
            }
        }
        System.out.println(Arrays.toString(c));

        return c;
    }
}
