package sobes;

import java.util.List;

public class TestПобитовыйСдвиг {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 15, 7);
        List<Integer> doubleList = list.stream()
                .map(n-> n>>1).toList();
        System.out.println(doubleList);
    }
}
