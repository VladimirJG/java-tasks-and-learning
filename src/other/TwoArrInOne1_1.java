package other;

import java.util.Arrays;

public class TwoArrInOne1_1 {
    public static void main(String[] args) {
        int[] arr1 = {0, 7, 9, 15};
        int[] arr2 = {1, 2, 3, 3, 5, 8, 11, 13, 17};
        concatenateArr(arr1, arr2);
    }

    public static int[] concatenateArr(int[] a, int[] b) {
        int[] endArr = new int[a.length + b.length];
        int count = 0;

        for (int i = 0, j = 0; i < Math.max(a.length, b.length); i++, j++) {
            int minNum = a[count];
            if (b[i] < minNum) {
                endArr[j] = b[i];
            } else {
                endArr[j] = a[count];
                endArr[j + 1] = b[i];
                count++;
                j++;
            }
        }
        System.out.println(Arrays.toString(endArr));
        return endArr;
    }
}
