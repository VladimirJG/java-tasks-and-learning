package initialisation_block;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        ClassTwo classTwo = new ClassTwo("Man", 1);
        Stream.of("yes", "no", "qwerty", "solid")
                .sorted(Comparator.comparingInt(String::length))
                .peek(s -> System.out.println("before filtering: " + s))
                .filter(s -> s.length() > 2)
                .forEach(s -> System.out.println("after filtering: " + s));
    }
}
