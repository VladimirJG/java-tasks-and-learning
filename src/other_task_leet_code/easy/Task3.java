package other_task_leet_code.easy;
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

import java.util.ArrayList;
import java.util.List;

//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class Task3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        StringBuilder newS = new StringBuilder();
        List<String> list = new ArrayList<>();
        list.add("");
        for (int i = 0; i < s.length(); i++) {
            String symbol = String.valueOf(s.charAt(i));
            if (newS.toString().contains(symbol)) {
                if (list.get(0).length() < newS.length()) {
                    list.set(0, newS.toString());
                }
                newS = new StringBuilder();
                newS.append(symbol);
            } else {
                newS.append(symbol);
            }
        }
        System.out.println(list.get(0).length());
    }
}
