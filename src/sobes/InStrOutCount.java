package sobes;

import java.util.HashMap;
import java.util.Map;

public class InStrOutCount {
    public static Map.Entry<Character, Integer> getPopularChar(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        Map<Character, Integer> letters = new HashMap<>();
        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentCount = letters.getOrDefault(currentChar, 0) + 1;
            letters.put(currentChar, currentCount);

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
            }
        }

        return Map.entry(maxChar, maxCount);
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        Map.Entry<Character, Integer> result = getPopularChar(s);
        if (result != null) {
            System.out.println("Most frequent character: " + result.getKey());
            System.out.println("Count: " + result.getValue());
        } else {
            System.out.println("The string is empty or null.");
        }
    }
}
