package sobes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestTwo {
    public static void main(String[] args) {
        String s = "9 4 9 9 12 -1 0 6 7 4 5 12 -1 0";


        String[] s1 = s.split(" ");
        Map<String, Integer> mapS = new HashMap<>();

        Arrays.stream(s1).forEach(e -> mapS.put(e, mapS.getOrDefault(e, 0) + 1));

        for (String str : s1) {
            if (mapS.get(str) == 1) {
                System.out.println(str);
                return;
            }
        }
        System.out.println("Not element");















       /* String[] numbers = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (String number : numbers) {
            if (map.get(number) == 1) {
                System.out.println("Первое неповторяющееся число: " + number);
                return;
            }
        }
        System.out.println("Все числа повторяются.");*/

    }
}
