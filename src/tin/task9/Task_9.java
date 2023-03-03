package tin.task9;

import java.util.*;

public class Task_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new LinkedList<>();

        if (n > 0 && n < 100) {
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num <= 300) {
                    list.add(num);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 100) {
                sum += list.get(i);
                list.set(i, 0);
            } else if (list.get(i) > 100) {
                sum += list.get(i);
                list.set(i, 0);
                if (Collections.max(list) > 100) {
                    list.set(list.indexOf(Collections.max(list)), 0);
                } else if (Collections.max(list) <= 100) {
                    list.set(list.indexOf(Collections.max(list)), 0);
                }
            }
        }
        System.out.println(sum);
    }
}
