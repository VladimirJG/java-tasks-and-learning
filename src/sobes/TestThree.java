package sobes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestThree {
    public static void main(String[] args) {
        String s = "JJjAcCbKdDaDnN";
        String[] splitStrings = s.replaceAll("(.)", "$1 ").trim().split(" ");
        Map<String, Integer> mapSI = new HashMap<>();

        Arrays.stream(splitStrings).forEach(e -> mapSI.put(e.toLowerCase(), mapSI.getOrDefault(e.toLowerCase(), 0) + 1));

        for (String str : mapSI.keySet()){
            if (mapSI.get(str) == 1){
                System.out.println(str);
                return;
            }
        }
        System.out.println("Nothing for request");
    }
}
