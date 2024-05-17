package sobes.aston;

import java.util.stream.Stream;

public class StreamAs {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .peek(System.out::println)
                .sorted()
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .findFirst();
    }
}
