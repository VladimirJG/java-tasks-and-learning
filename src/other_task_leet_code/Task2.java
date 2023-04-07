package other_task_leet_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 3);
        List<Integer> list2 = List.of(5, 6, 4);
        System.out.println(addTwoNumbers(list, list2));
    }

    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> list = new ArrayList<>();
        String num = String.valueOf(num(l1) + num(l2));
        for (int i = 0; i < num.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        Collections.reverse(list);
        return list;
    }

    public static int num(List<Integer> l1) {
        String n = "";
        for (int i = l1.size() - 1; i >= 0; i--) {
            n += String.valueOf(l1.get(i));
        }
        int m = Integer.parseInt(n);
        return m;
    }
}
