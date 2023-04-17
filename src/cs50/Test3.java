package cs50;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8, 10, 11, 15};
        int[] arr2 = {0, 1, 2, 2, 3, 7};
        fillArray(arr1, arr2);

    }

    public static int[] fillArray(int[] a, int[] b) {

        int[] newArr = new int[a.length + b.length];
        int minNum = 0;
        int maxNum = 0;
        newArr[0] = Math.min(a[0], b[0]);
        newArr[1] = Math.max(a[0], b[0]);
        for (int i = 1, j = 2; i < Math.max(a.length, b.length); i++, j++) {
            minNum = Math.min(a[i], b[i]);
            maxNum = Math.max(a[i], b[i]);
            int replaceNum = 0;
            if (minNum < newArr[j - 1]) {
                for (int i1 = 0; i1 < newArr.length; i1++) {
                    if (minNum < newArr[i1]) {
                        replaceNum = newArr[i1];
                        newArr[i1] = minNum;
                        if (replaceNum<newArr[i1+1]){
                            int anotherReplace = newArr[i1+1];
                            newArr[i1+1] = replaceNum;
                            replaceNum = anotherReplace;
                        }
                        break;
                    }
                }
            }
            newArr[j] = replaceNum;
            newArr[j+1] = maxNum;
            j++;

        }
        System.out.println(Arrays.toString(newArr));
        return newArr;
    }
}
