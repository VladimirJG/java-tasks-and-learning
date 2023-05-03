package dmdev.oop.lesson19.map;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("bbb"));
        System.out.println(set.add("aaa"));
        System.out.println(set.add("ddd"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("bbb"));

        System.out.println(set);
    }
}
