package Alishev.iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Map<Long, String> XZ = new HashMap<>();
        for (int i = 0; i < 50000; i++) {
            XZ.put((long) i, i * 120 + " name");
//            System.out.println(XZ.get((long) i));
        }
        Map<Long,Boolean> resultMap = getCertainValue(XZ);
        System.out.println(resultMap);
    }

    private static Map<Long,Boolean> getCertainValue( Map<Long, String> XZ){
       return XZ.entrySet().stream().filter(e->e.getValue().startsWith("5")).collect(Collectors.toMap(Map.Entry::getKey,e->true));
    }
}
