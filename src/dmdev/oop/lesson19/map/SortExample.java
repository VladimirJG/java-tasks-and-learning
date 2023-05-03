package dmdev.oop.lesson19.map;

import dmdev.oop.lesson19.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "Ivanov"),
                new Person(29, "Petr", "Petrov"),
                new Person(3, "Sveta", "Sveticova")
        );
        Collections.sort(personList);
        System.out.println(personList);

        //Collections.sort(personList,new FirstNameComparator());  //1 var
      //  personList.sort(new FirstNameComparator());              //2 var
        personList.sort(Comparator.comparing(Person::getFirstName));
        System.out.println(personList);
    }
    public static class FirstNameComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
