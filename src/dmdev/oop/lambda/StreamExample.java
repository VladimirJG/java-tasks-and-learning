package dmdev.oop.lambda;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = List.of("11", "22", "33", "44", "55");

       /* for (String s : list) {
            String value = s + s;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }*/
        /*list.stream().map(s -> s + s)
                .map(s -> Integer.valueOf(s))
                .filter(s -> s % 2 == 0)
                .forEach(s-> System.out.println(s));*/

        list.stream().map(s -> s + s)
                .map(Integer::valueOf)
                .filter(s -> s % 2 == 0)
                .forEach(System.out::println);
    }
}
