package dmdev.oop.lesson19.map;

import dmdev.oop.lesson19.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person petr = new Person(1, "Petr", "Petrov");
        Person ivan = new Person(29, "Ivan", "Ivanov");
        Person sveta = new Person(3, "Sveta", "Sveticova");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

       // System.out.println(map.entrySet());
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
