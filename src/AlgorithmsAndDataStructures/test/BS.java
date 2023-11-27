package AlgorithmsAndDataStructures.test;

import java.util.Arrays;

public class BS {
    public static void main(String[] args) {
        int key = 158;
        int[] numArr = {2, 17, 46, 13, 98, 56, 28, 93, 74, 8, 121, 37, 32, 64, 61, 10, 5, 157, 65, 18, 42};
        System.out.println(binaryS(numArr, key));
    }

    private static int binaryS(int[] numArr, int key) {
        int start = 0;
        int finish = numArr.length - 1;
        int count = 0;

        Arrays.sort(numArr);

        while (start <= finish) {
            int mid = start + (finish - start) / 2;
            if (numArr[mid] < key) {
                start = mid + 1;
                count++;
            } else if (numArr[mid] > key) {
                finish = mid - 1;
                count++;
            } else
                return mid;
        }
        System.out.println(count);
        return -1;
    }
}
