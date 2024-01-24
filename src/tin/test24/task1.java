package tin.test24;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("onecode");
        list.add("one");
        list.add("ocodene");
        list.add("oncodee");

        List<String> code = list.stream().map(s -> s.contains("code") ? s.replaceAll(s, "???") : s).toList();

        System.out.println(code);
    }
}
