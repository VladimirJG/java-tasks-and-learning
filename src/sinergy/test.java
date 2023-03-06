package sinergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "Каша Машев", "Jora Bora", "Input Strimov");
        System.out.println(list);
      /*  for (int i = 0; i < list.size(); i++) {
            String[] m = list.get(i).split(" ");
            list2.add(m[1]);
        }
        System.out.println(list2);*/

        //list.forEach(s -> System.out.println(Arrays.toString(new String[]{s.split(" ")[1]})));
        // list.forEach(s-> list2.add(Arrays.toString(new String[]{s.split(" ")[1]})));
        list2.addAll(list.stream().map(s -> s.split(" ")[1]).toList());

        System.out.println(list2);
    }
}
