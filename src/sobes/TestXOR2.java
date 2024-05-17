package sobes;

import java.util.Arrays;
import java.util.List;

public class TestXOR2 {
    public static void main(String[] args) {
        String[] arr = {"abc","abc", "cvb", "dsa", "cvb","ioi", "dsa"};

        Integer reduce = Arrays.stream(arr)
                .map(s -> s.chars().sum())
                .reduce(0, (x, y) -> x ^ y);

        System.out.println(reduce);

        List<String> collect = Arrays.stream(arr)
                .filter(s -> s.chars().sum() == reduce)
                .toList();

        System.out.println(collect);
    }
}
