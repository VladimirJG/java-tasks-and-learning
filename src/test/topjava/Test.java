package test.topjava;

import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив,
 * где ключ – элемент списка, значение – количество этих элементов в списке.
 * Порядок не имеет значения.
 * <p>
 * Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}
 */
public class Test {
    public static void main(String[] args) {
        int[] arrOfNum = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> listOfElements = new HashMap<>();
        Map<Integer, Integer> listOfElements2 = new HashMap<>();

        for (int j : arrOfNum) {
            int m = 1;
            listOfElements.merge(j, m, Integer::sum);
        }

      // listOfElements2= Arrays.stream(arrOfNum).collect(Collectors.groupingBy(, Collectors.counting()));
      //  ArrayList<Integer>list  = Stream.of(arrOfNum).map(elem -> elem).toList();
    }
}
