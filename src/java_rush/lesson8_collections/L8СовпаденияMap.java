package java_rush.lesson8_collections;
//Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
//
//Требования:
//•	Программа не должна выводить текст на экран.
//•	Программа не должна считывать значения с клавиатуры.
//•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
//•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
//•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.

import java.util.HashMap;
import java.util.Map;

public class L8СовпаденияMap {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map1 = new HashMap<>();
        map1.put("Карась", "Карасев");
        map1.put("Сызрань", "Лапов");
        map1.put("Карась", "Некрасов");
        map1.put("Утка", "Карасев");
        map1.put("Марась", "Сомов");
        map1.put("Сом", "Уткин");
        map1.put("Слава", "Зайцев");
        map1.put("Карась", "Карасев");
        map1.put("Карась", "Карасев");
        map1.put("Карась", "Карасев");

        return map1;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
