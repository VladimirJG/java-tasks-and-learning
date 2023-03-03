package tin.task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < countOfStudents; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                int m = list.get(i);
                for (int i1 = i + 1; i1 < list.size(); i1++) {
                    int count = 0;
                    if (list.get(i1) == m) {
                        count++;
                    }
                    if (count >= 1) {
                        System.out.println("-1 -1");
                    }
                }
                int j = list.get(i + 1) - list.get(i);
                if (j >= 2) {
                    System.out.println(list.get(i) + ", " + (list.get(i) + 1));
                } else {
                    System.out.println("-1 -1");
                }
            } else {
                System.out.println("-1 -1");
            }
        }
    }
}
