package JavaR2;
//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskSetCreateDeleteInt {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> setInt = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            setInt.add(i + i + i - 1);
        }
        return setInt;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer>newSet = new HashSet<>(set);
        for (Integer num :
                newSet) {
            if (num > 10) {
                set.remove(num);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
        System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
