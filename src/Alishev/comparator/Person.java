package Alishev.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(3, "Bob"));
        personList.add(new Person(2, "Ted"));
        personList.add(new Person(1, "Mary"));
        System.out.println(personList);
        personList.sort(Comparator.comparingInt(Person::getId));
        System.out.println(personList);
    }

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
