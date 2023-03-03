package java_rush.lesson8_collections;

import java.util.HashSet;
import java.util.Set;

//Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//Удалить из множества все числа больше 10.
//•	Класс Solution должен содержать только три метода.
//•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
public class L8RemoveIfBig10 {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> copy = new HashSet<>(set);
        for (Integer num : set) {
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
    //JR
   /* public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(16);
        set.add(26);
        set.add(36);
        set.add(46);
        set.add(56);
        set.add(66);
        set.add(76);
        set.add(86);
        set.add(10);
        set.add(6);

        set.add(17);
        set.add(27);
        set.add(37);
        set.add(47);
        set.add(57);
        set.add(67);
        set.add(77);
        set.add(87);
        set.add(97);
        set.add(7);

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> copy = new HashSet<>(set);
        for (Integer number : copy) {
            if (number > 10) {
                set.remove(number);
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }*/
}
