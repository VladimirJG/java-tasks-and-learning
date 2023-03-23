package other_task;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task6_1 {
    public static void main(String[] args) {
        String s = "babaddgtot";
        selection(s);

    }

    public static long selection(String str) {
       long s = Stream.of(str).map(n -> n.split("")).map(Arrays::stream).count();
        System.out.println(s);
        return s;
    }
}
