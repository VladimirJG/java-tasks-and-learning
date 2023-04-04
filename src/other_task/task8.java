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
        String[] strs = {"flower", "flow", "flight"};
        List<String> list = new ArrayList<>();
        String m = strs[0];
        for (int i = 0; i < m.length(); i++) {
            String n = String.valueOf(m.charAt(i));
            list.add(n);
        }
        String e = "";
        for (int i = 1; i < strs.length; i++) {
            String k = strs[i];
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (k.contains(list.get(i1))) {
                    e += list.get(i1);
                }
            }
        }

    }
}
