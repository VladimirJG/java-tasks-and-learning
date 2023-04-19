package other;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 17, 46, 13, 98, 56, 28, 93, 74, 8, 121, 37, 32, 64, 61, 10, 5, 157, 65, 18, 42};
        int key = 74;
        num(arr, key);
    }

    public static int num(int[] arr, int key) {
        int lengthArr = arr.length;
        Arrays.sort(arr);
        while (true) {
            int[] firstArr = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] secondArr = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            if (firstArr[firstArr.length - 1] > key) {
                arr = firstArr;
            } else if (secondArr[0] < key) {
                arr = secondArr;
            }
            if (arr.length < 1 || firstArr[firstArr.length - 1] == key || secondArr[0] == key) {
                System.out.println(secondArr[0]);
                break;
            }
        }

        return arr[0];
    }
}
