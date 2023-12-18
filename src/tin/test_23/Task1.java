package tin.test_23;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("TINKOFF", "TINKOFFF", "AAAA", "FFOKNIT");
        List<String> resultList = list.stream().map(str -> hasAllTinkoffSymbols(str) ? "yes" : "no").toList();
        System.out.println(resultList);
    }

    public static boolean hasAllTinkoffSymbols(String str) {
        String string = "TINKOFF";
        if (str.length() != string.length())
            return false;
        for (int i = 0; i < string.length(); i++) {
            String c = String.valueOf(string.charAt(i));
            if (!str.contains(c))
                return false;
        }
        return true;
    }
}
