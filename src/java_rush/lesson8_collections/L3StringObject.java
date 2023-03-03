package java_rush.lesson8_collections;

import java.util.HashMap;
import java.util.Map;

//Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
public class L3StringObject {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код
        for (Map.Entry<String, Object> pair :
                map.entrySet()) {
            String key = pair.getKey();
            Object value= pair.getValue();
            System.out.println(key + " - " + value);
        }
        //JR
/*
        for (Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
*/
    }
}
