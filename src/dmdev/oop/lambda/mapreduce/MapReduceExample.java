package dmdev.oop.lambda.mapreduce;

import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Stream.of(
                new Student(25, "Ivan"),
                new Student(32, "Mivan"),
                new Student(38, "Lesa"),
                new Student(18, "Petro"),
                new Student(19, "Dima"),
                new Student(43, "Sveta"),
                new Student(37, "Vova")
        )
               /* .map(student -> student.getAge())
                .reduce((age1,age2)->Math.max(age1,age2))
                .ifPresent(System.out::println);*/
                .map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);
    }
}
