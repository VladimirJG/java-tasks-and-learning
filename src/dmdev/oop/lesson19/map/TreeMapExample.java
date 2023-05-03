package dmdev.oop.lesson19.map;

import dmdev.oop.lesson19.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Person petr = new Person(1, "Petr", "Petrov");
        Person ivan = new Person(29, "Ivan", "Ivanov");
        Person sveta = new Person(3, "Sveta", "Sveticova");
        Person sveta1 = new Person(30, "Sveta1", "Sveticova");
        Person sveta2 = new Person(45, "Sveta2", "Sveticova");
        Person sveta3 = new Person(10, "Sveta3", "Sveticova");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);
        map.put(sveta1.getId(), sveta1);
        map.put(sveta2.getId(), sveta2);
        map.put(sveta3.getId(), sveta3);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
