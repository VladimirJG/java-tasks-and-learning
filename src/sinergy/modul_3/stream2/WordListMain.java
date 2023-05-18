package sinergy.modul_3.stream2;

import java.util.List;
import java.util.Optional;

public class WordListMain {
    public static void main(String[] args) {
        List<String> sadness = List.of("Зайку", "бросила", "хозяйка", "очень", "радуется", "зайка");
        Optional<String> reduceSadness = sadness.stream().reduce((value1, value2) -> value1 + " " + value2);
        System.out.println(sadness);
        System.out.println(reduceSadness);
    }
}
