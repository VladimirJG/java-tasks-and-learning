package test.topjava;

import java.util.List;

public class TestHW_0 {
    public static void main(String[] args) {
        List<String> list = List.of(
                "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"
        );
        System.out.println(list.get(list.indexOf("four")));
    }

}
