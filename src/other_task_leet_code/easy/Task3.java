package other_task_leet_code.easy;


//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

import java.util.HashMap;
import java.util.Map;

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
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        //  StringBuilder line = new StringBuilder();
        //        StringBuilder result = new StringBuilder();
        //        for (int i = 0; i < s.length(); i++) {
        //            String charStr = String.valueOf(s.charAt(i));
        //            if (!line.toString().contains(charStr)) {
        //                line.append(charStr);
        //                if (i == s.length() - 1) {
        //                    result = line;
        //                }
        //            } else if (line.length() > result.length()) {
        //                result = line;
        //                line = new StringBuilder(String.valueOf(s.charAt(i)));
        //            }
        //        }
        //        return result.length();


        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch) && map.get(ch) >= length) {
                length = map.get(ch) + 1;
            }
            map.put(ch, i);
            maxLength = Math.max(maxLength, i - length + 1);
        }
        return maxLength;
    }
}
