package dmdev.oop.lambda.tasks;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк. Найти количество уникальных строк, длиной более 8 символов
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("jkfvjks;h", "jvhejwhbkbkb", "vhfb", "bckjbk", "jkfvjks;h", " jdksvkjkeuu", "nvrbksb", "jvhejwhbkbkb");
        long count = list.stream()
                .filter(s -> s.length() > 8)
                .distinct()                                      // 1 var
                .count();
        System.out.println(count);

        int result = list.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())                //2var
                .size();
        System.out.println(result);
    }
}
