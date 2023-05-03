package dmdev.oop.lesson19.collections.practics;

import java.util.HashSet;
import java.util.Map;

/**
 * Написать метод ... который принимает Map<String,String> и возвращает true, если каждому ключу соответствует свое
 * уникальное значение
 */
public class Task3 {
    public static void main(String[] args) {
       /* Map<String,String> map = new HashMap<>();
        map.put("Lesly","Nilson");
        map.put("Tony","Howk");
        map.put("Vanessa","May");
        map.put("Dana","Scally");
        map.put("Stuart","Little");*/

        Map<String, String> map = Map.of(
                "Lesly", "Nilson",
                "Tony", "Howk",
                "Vanessa", "May",
                "Dana", "Scally",
                "Stuart", "Little"
        );
        System.out.println(isUnique(map));
    }

    private static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}
