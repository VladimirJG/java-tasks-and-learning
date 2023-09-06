package other;

import java.util.ArrayList;
import java.util.List;

public class Any {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 25; i < 50; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(15);
        list.add(15, 64);
        List<Integer> list1 = list.stream().filter(s -> s % 2 == 0).toList();
        System.out.println(list1);
    }

}
