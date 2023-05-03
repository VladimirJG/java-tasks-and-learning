package dmdev.oop.lesson19.map;

import dmdev.oop.lesson19.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person petr = new Person(1, "Petr", "Petrov");
        Person ivan = new Person(2, "Ivan", "Ivanov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map.get(2));

        System.out.println("++++++++++++++++++");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println("++++++++++++++++++++++++++");

        for (Person person : map.values()) {
            System.out.println(person.getFirstName());
            System.out.println(person.getId());
            System.out.println(person.getLastName());
            System.out.println(person.getClass());
        }
        System.out.println("________________________");
        for (Map.Entry<Integer, Person> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println("}}}}}}}}}}}}}}}}}}}}");
        System.out.println(map.containsKey(1));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
