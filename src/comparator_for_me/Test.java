package comparator_for_me;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        InputString inputString = new InputString("aabbvvvvggdddcc");

        List<String> list = numOfChar(inputString);
//        System.out.println(list);
        System.out.println(LocalDateTime.now());

    }




    public static List<String> numOfChar(InputString inputString) {
        String s = inputString.getInString();
        Map<Character, Integer> charOut = new LinkedHashMap<>();
        IntStream.range(0, s.length()).forEach(i -> {
            char c = s.charAt(i);
            charOut.put(c, charOut.getOrDefault(c, 0) + 1);
        });
        return charOut.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(entry -> entry.getKey() + " : " + entry.getValue()).collect(Collectors.toList());
    }
}
