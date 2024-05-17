package sobes;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {9, 9, -5, 0, -1, 8, 6, 7, 9};
        int leftIndex;
        int count = 0;
        Arrays.sort(arr);
        for (Integer c : arr) {
            if (c % 2 == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && count >= 0) {
                leftIndex = arr[i];
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = leftIndex;
                i--;
                count--;
            }
        }
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            if (arr[left] % 2 == 0 && arr[right] % 2 != 0) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//
//            if (arr[left] % 2 != 0) {
//                left++;
//            }
//
//            if (arr[right] % 2 == 0) {
//                right--;
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
}
