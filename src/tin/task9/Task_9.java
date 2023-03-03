package tin.task9;

import java.util.*;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("8 45 268 31 115 248 101 198 76");
        int n = sc.nextInt();
        List<Integer> list0 = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();

        if (n > 0 && n < 100) {
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num <= 300) {
                    list.add(num);
                    if (num >= 100) {
                        list0.add(num);
                    } else {
                        list1.add(num);
                    }
                }
            }
        }
        System.out.println(list);
        System.out.println(list0);
        System.out.println(list1);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 100) {
                sum += list.get(i);
                list.set(i, 0);
            } else if (list.get(i) > 100) {
                sum += list.get(i);
                list.set(i, 0);
                if (Collections.max(list) > 100) {
                    sum -= Collections.max(list);
                    list.set(list.indexOf(Collections.max(list)), 0);
                }
            }
        }
        if (list0.size() % 2 != 0) {
            sum -= Collections.max(list1);
        }
        System.out.println(list);
        System.out.println(sum);
        System.out.println(45 + 268 + 31 + 115 - 248 + 101 - 198 - 76);//числа, которые идут после
        System.out.println(Collections.max(list1));
        System.out.println(list2);
    }
}
