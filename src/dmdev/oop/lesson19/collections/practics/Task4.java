package dmdev.oop.lesson19.collections.practics;

import java.util.*;

/**
 * Сложить два многочлена заданной степени, если коэффициенты многочлена хранятся в
 * объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки:
 * ax^6 + bx^4 + cx^3 + dx +8
 */
public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polinomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polinomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );
        System.out.println(convertToString(sum(polinomial1, polinomial2)));
    }

    public static String convertToString(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polinomial1, Map<Integer, Integer> polinomial2) {
        Map<Integer, Integer> polinomialResult = new HashMap<>(polinomial1);

        for (Map.Entry<Integer, Integer> entry : polinomial2.entrySet()) {
            Integer orDefault = polinomialResult.getOrDefault(entry.getKey(), 0);
            polinomialResult.put(entry.getKey(), orDefault + entry.getValue());
        }

        return polinomialResult;
    }
}
