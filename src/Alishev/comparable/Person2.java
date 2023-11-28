package Alishev.comparable;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Person2 implements Comparable<Person2> {
    public static void main(String[] args) {
        List<Person2> person2List = new ArrayList<>();
        Set<Person2> person2Set = new TreeSet<>();
        addElement(person2List);
        addElement(person2Set);

        Collections.sort(person2List);

        System.out.println(person2List);
        System.out.println(person2Set);

    }

    private static void addElement(Collection collection) {
        collection.add(new Person2(3, "Bob"));
        collection.add(new Person2(2, "Ted"));
        collection.add(new Person2(1, "Mary"));
    }

    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return id == person2.id && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Person2 o) {
//        return Integer.compare(this.id, o.getId());
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else return 0;
    }
}
