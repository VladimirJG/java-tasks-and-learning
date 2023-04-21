package other;

import java.util.Arrays;

public class TwoArrInOne {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {0,2,2};
        mergeArrays(arr1, arr2);
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] endArr = new int[a1.length + a2.length];
        int count = 0;

        for (int i = 0, j = 0; i < Math.max(a1.length, a2.length); i++, j++) {
            int minNum = a1[count];
            if (a2[i] < minNum) {
                endArr[j] = a2[i];
            } else {
                endArr[j] = a1[count];
                endArr[j + 1] = a2[i];
                count++;
                j++;
            }
        }
        System.out.println(Arrays.toString(endArr));
        return endArr;
    }
}
