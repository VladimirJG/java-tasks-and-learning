package itrum.collection;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "1", "2"));
        System.out.println(mergeMap(list));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2));
        System.out.println(mergeMap(list1));
    }

    public static <T> Map<T, Integer> mergeMap(List<T> list) {
        Map<T, Integer> map = new HashMap<>();
        list.forEach(e -> map.merge(e, 1, (a, b) -> b + 1));
        return map;
    }
}