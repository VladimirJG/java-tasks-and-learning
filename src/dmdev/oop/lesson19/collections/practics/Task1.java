package dmdev.oop.lesson19.collections.practics;

import java.util.ArrayList;
import java.util.List;

/**
 * написать метод, который возвращает целочисленный список и возвращает целочисленный список только с нечетными значениями
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 8, 9, 13, 20);
        List<Integer> result = removeEven(list);
        System.out.println(result);
    }

    private static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (value % 2 != 0) {
                result.add(value);
            }
        }
        return result;
    }
}
