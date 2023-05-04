package dmdev.oop.lambda.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список целых чисел, вывести строку, представляющую собой
 * конкатенацию строковых представлений этих чисел
 * Пример список{1,2,3,4,5}
 * Вывод: "12345"
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        String collect = list.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
