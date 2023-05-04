package dmdev.oop.lambda.tasks;

import java.util.Map;

/**
 * Дана Map<String,Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Petrov", 7,
                "Ivanchenko", 2,
                "karasev", 4,
                "Stradalcev", 17,
                "Gusev", 28,
                "Star", 3,
                "Laev", 5
        );
        int sum = map.entrySet().stream()
                .filter(s -> s.getKey().length() < 7)
                .mapToInt(s -> s.getValue().intValue())
                .sum();
        System.out.println(sum);

    }
}
