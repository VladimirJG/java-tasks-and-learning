package other_task;
//Напишите функцию, которая находит самую длинную строку общего префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку "".

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
public class task8 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight", "floor"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String str1 = strs[0];
        String str2 = "";
        for (int i = 1; i < strs.length; i++) {
            for (int i1 = 0; i1 < strs[i].length(); i1++) {
                if (i1 < str1.length()) {
                    String substr1 = String.valueOf(strs[i].charAt(i1));
                    String substr2 = String.valueOf(str1.charAt(i1));
                    if (substr1.equals(substr2)) {
                        str2 += substr1;
                    }
                }
            }
            str1 = str2;
            str2 = "";
        }
        return str1;
    }
}
