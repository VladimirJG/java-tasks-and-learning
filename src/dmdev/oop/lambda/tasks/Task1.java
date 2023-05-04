package dmdev.oop.lambda.tasks;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Дан список целых чисел. Найти среднее всех нечетных чисел делящихся на 5
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 25, 55, 18, 94, 124, 15, 3, 17, 24, 52);
        OptionalDouble optionalDouble = list.stream()
                .filter(s -> s % 2 != 0)
                .filter(s -> s % 5 == 0)
                .mapToInt(Integer::valueOf)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
