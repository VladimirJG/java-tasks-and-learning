package java_rush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
        List<Integer> list = new ArrayList<>();

        //for (int i = 0; i < data.length; i++) list.add(data[i]);
        for (int d : data) list.add(d);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int d : list) {
            if (d % 2 == 0) {
                even.add(d);
            }
            odd.add(d);
        }
        Collections.sort(even);
        Collections.sort(odd);

        System.out.println(even);
        System.out.println(odd);
    }
}