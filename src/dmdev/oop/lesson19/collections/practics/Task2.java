package dmdev.oop.lesson19.collections.practics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает количество
 * уникальных целых чисел в этом списке. При получении пустого списка метод должен вернуть 0
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 9, 5, 4, 7, 23, 45, 5, 62, 1, 13);
        int result = countUnique(list);
        System.out.println(result);
    }

    private static int countUnique(List<Integer> list) {
       // return  list.stream().distinct().toList().size();
        HashSet<Integer> integers = new HashSet<>(list);//hashSet содержит только уникальные значения
        return integers.size();
        //ctrl + alt + n объединит в одну строку return
    }
}
