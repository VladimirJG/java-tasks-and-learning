package other_task_leet_code.easy.task_83;

import java.util.Arrays;

public class Task338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {
       /* int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;*/


        int[] arrNum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            String str = Integer.toBinaryString(i);

            char[] charArray = str.toCharArray();
            int res = 0;
            for (char c : charArray) {
                res += Integer.parseInt(String.valueOf(c));
            }
            arrNum[i] = res;
        }
        return arrNum;

    }
}
