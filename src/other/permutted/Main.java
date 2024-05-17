package other.permutted;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //cry dry
        //abcd dbca
        //avv vaa

        System.out.println(isPerm("cry", "dry"));
        System.out.println(isPerm("abcd", "dbca"));
        System.out.println(isPerm("avv", "vaa"));
    }

    public static boolean isPerm(String wordOrig, String wordCandidate) {
        if (wordOrig.length() != wordCandidate.length()) {
            return false;
        }
//        return sortCharFromString(wordOrig).equals(sortCharFromString(wordCandidate));
        return mapFromString(wordOrig).equals(mapFromString(wordCandidate));
    }

    private static List<Character> sortCharFromString(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        Collections.sort(list);
        return list;
    }

    private static Map<Character, Integer> mapFromString(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
