package java_rush.lesson8_collections;

import java.util.HashMap;
import java.util.Map;

//1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//4. Вывести содержимое Map на экран.
//
//Требования:
//•	Программа должна выводить текст на экран.
//•	Класс Solution должен содержать только три метода.
//•	Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String.
// Кроме того, добавлять в словарь 10 человек.
//•	В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
//•	В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
//•	Метод printPeopleMap() должен выводить на экран всех людей из словаря Map.
// Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
//•	Метод main() должен вызывать метод createPeopleMap().
//•	Метод main() должен вызывать метод printPeopleMap().
public class L11MapBig {
    public static void main(String[] args) {

        Map<String, String> people = createPeopleMap();
        printPeopleMap(people);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> listPeople = new HashMap<>();
        listPeople.put("1", "2");
        listPeople.put("2", "3");
        listPeople.put("3", "1");
        listPeople.put("4", "5");
        listPeople.put("7", "2");
        listPeople.put("5", "9");
        listPeople.put("1", "18");
        listPeople.put("6", "5");
        listPeople.put("8", "12");
        listPeople.put("9", "2");

        return listPeople;
    }

    public static void printPeopleMap(Map<String, String> listPeople) {
        for (Map.Entry<String, String> pair : listPeople.entrySet()
        ) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + "," + value);
        }
    }
}
