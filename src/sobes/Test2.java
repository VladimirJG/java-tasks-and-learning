package sobes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {9, 9,-5, 0, -1, 6, 7, 9};
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(Integer i : arr){
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            if (m.getValue() == 1){
                System.out.println(m.getKey());
                break;
            }
        }
        System.out.println(map);
    }
}
