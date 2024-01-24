package tin.test24;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        int quantity = 10;
        List<Integer> booksHeight = List.of(1, 2, 2, 4, 2, 4, 4, 3, 5, 5);
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer integer : booksHeight) {
            map.merge(integer, 1, Integer::sum);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        System.out.println(map.size());
        System.out.println(list);
    }
}
