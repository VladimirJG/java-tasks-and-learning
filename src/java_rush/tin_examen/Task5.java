package java_rush.tin_examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        int m = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                m = list.get(i);
                list2.add(m-1);
            }else {
                list2.add(list.get(i));
            }
        }
        int res = 0;
        for (int i = 0; i < list2.size(); i++) {
            res+=list2.get(i);
        }
        System.out.println(res);
    }
}
