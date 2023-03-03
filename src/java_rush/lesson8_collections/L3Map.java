package java_rush.lesson8_collections;

import java.util.HashMap;
import java.util.Map;

//Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
//арбуз - ягода,
//банан - трава,
//вишня - ягода,
//груша - фрукт,
//дыня - овощ,
//ежевика - куст,
//жень-шень - корень,
//земляника - ягода,
//ирис - цветок,
//картофель - клубень.
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
public class L3Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("жень-шень", "куст");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair :
                map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ", " + value);
        }
    }
}
