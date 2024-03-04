package itrum.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private Map<String, Integer> grades;

    public Student(String name, Map<String, Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}

public class ParallelStreamCollectMapAdvancedExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Student1", Map.of("Math", 90, "Physics", 85)),
                new Student("Student2", Map.of("Math", 95, "Physics", 88)),
                new Student("Student3", Map.of("Math", 88, "Chemistry", 92)),
                new Student("Student4", Map.of("Physics", 78, "Chemistry", 85))
        );
        Map<String, Integer> map = new HashMap<>();
        for (Student student : students) {
            Map<String, Integer> studentGrades = student.getGrades();
            studentGrades.forEach((k, v) -> {
                map.merge(k, v, (a, b) -> (a + b) / 2);
            });
        }
        System.out.println(map);

// parallelStream
        Map<String, Integer> result = students.parallelStream()
                .flatMap(s -> s.getGrades().entrySet().parallelStream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> (a + b) / 2
                ));
        System.out.println(result);

    }
}