package cs50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {0, 1, 2, 3, 7};
        int[] copyArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, copyArr, 0, arr1.length);
        System.arraycopy(arr2, 0, copyArr, arr1.length, arr2.length);
        Arrays.sort(copyArr);
        System.out.println(Arrays.toString(copyArr));
    }
}

