package dmdev.oop.lambda.tasks;

import java.util.Comparator;
import java.util.List;

/**
 * Дан класс Person с полями firstName, lastName, age. Вывести полное имя самого старшего человека у которого
 * длина этого имени не превышает 15 символов.
 */
public class Task5 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Petr", "Petrov", 23),
                new Person("Ivan", "Ivanov", 25),
                new Person("Sveta", "Sveticova", 27),
                new Person("Dana", "Danaeva", 32),
                new Person("Roma", "Romanovski", 18),
                new Person("Ser-Gei", "Gei-Serov", 43)
        );
        people.stream()
                .filter(s -> s.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);
    }
}
