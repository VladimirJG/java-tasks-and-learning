package other_task;

import java.util.ArrayList;
import java.util.List;

//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
public class Task9Polindrome {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        boolean tru = false;
        if (x<0){
            return tru;
        }
        String y = String.valueOf(x);
        String m = "";
        for (int i = y.length() - 1; i >= 0; i--) {
            String o = String.valueOf(y.charAt(i));
            m += Integer.parseInt(o);
        }
        int i = Integer.parseInt(m);
        if (i == x) {
            tru = true;
        }
        return tru;
    }
}
