package other;

import java.util.Arrays;

public class TwoArrInOne {
    public static void main(String[] args) {
        int[] arr1 = {0, 7, 9, 15};
        int[] arr2 = {1, 2, 3, 5, 8, 11, 13, 17};
        concatenateArr(arr1, arr2);
    }

    public static int[] concatenateArr(int[] a, int[] b) {
        int[] endArr = new int[a.length + b.length];
        for (int i = 0, j = 0; i < Math.max(a.length, b.length); i++, j++) {
            if (i >= a.length) {
                endArr[j] = b[i];
            } else if (i >= b.length) {
                endArr[j] = a[i];
            } else {
                endArr[j] = Math.min(a[i], b[i]);
                endArr[j + 1] = Math.max(a[i], b[i]);
                if (j >= 2 && endArr[j] < endArr[j - 2]) {
                    int n = endArr[j - 2];
                    int m = endArr[j - 1];
                    endArr[j - 2] = endArr[j];
                    endArr[j - 1] = n;
                    endArr[j] = m;
                } else if (j >= 2 && endArr[j] < endArr[j - 1]) {
                    int n = endArr[j - 1];
                    endArr[j - 1] = endArr[j];
                    endArr[j] = n;
                }
                j++;
            }
            if (j >= 2 && endArr[j] < endArr[j - 2]) {
                int n = endArr[j - 2];
                int m = endArr[j - 1];
                endArr[j - 2] = endArr[j];
                endArr[j - 1] = n;
                endArr[j] = m;
            } else if (endArr[j] < endArr[j - 1]) {
                int n = endArr[j - 1];
                endArr[j - 1] = endArr[j];
                endArr[j] = n;
            }
        }
        System.out.println(Arrays.toString(endArr));
        return endArr;
    }
}
