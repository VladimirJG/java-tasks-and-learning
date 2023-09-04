package test.topjava;

import java.util.ArrayList;
import java.util.List;

public class LiveCodingOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {
            {
                {
                    add(1);
                    add(2);
                    add(3);
                    add(4);
                    add(5);
                    add(6);
                    add(7);
                }
            }
        };
        /*for (int i = 1; i <= 7; i++) {
            list.add(i);
        }*/
       // System.out.println(list);
        // list.removeIf(s -> s % 2 == 0);
        List<Integer> collect = list.stream().filter(s -> s % 2 != 0).toList();
       // System.out.println(collect);
/*
II
 */


    }

}
