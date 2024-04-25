package comparator_for_me;

import java.util.*;

public class Comp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Bravo");
        list.add("Comp");
        list.add("Comparator");
        list.add("Modificator");

        list.sort(Comparator.comparingInt(String::length).reversed());
        System.out.println(list);

    }
  /*  @AllArgConstructor
    public class Person{
       private String param;
    }
    Set<Person> personSet = new HashSet<>();

    personSet.add(new Person("123"));
    personSet.add(new Person("123"));*/
}
