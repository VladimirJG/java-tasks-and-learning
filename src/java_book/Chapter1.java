package java_book;

import java.util.ArrayList;
import java.util.List;

public class Chapter1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 8));

        long count = list.stream().peek(System.out::println).count();
        System.out.println(count);
    }
}
