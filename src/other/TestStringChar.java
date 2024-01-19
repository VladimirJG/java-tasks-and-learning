package other;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Пример входной строки: “aaaaabcccc”
        Пример выходного результата: “a”: 5, “c”: 4, “b”: 1*/
public class TestStringChar {
    public static void main(String[] args) {
        String s1 = "aaaaabccc";
//        numOfChar(s1);
        List<Map.Entry<Character, Integer>> reverse = reverse(s1);
        for (int i = 0; i < reverse.size(); i++) {
            Map.Entry<Character, Integer> characterIntegerEntry = reverse.get(i);
            System.out.println(characterIntegerEntry);
        }

    }

    /*public static String numOfChar(String s) {
        Map<Character, Integer> charOut = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charOut.put(c, charOut.getOrDefault(c, 0) + 1);
        }
        charOut.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .map(entry -> entry.getKey() + " : " + entry.getValue()).forEach(System.out::println);
        return null;
    }*/

    private static List<Map.Entry<Character, Integer>> reverse(String s) {
        Map<Character, Integer> newMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            newMap.put(c, newMap.getOrDefault(c,0)+1);
        }
        Map<Character, Integer> newMap1 = newMap;
        return newMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .toList();
    }
}
