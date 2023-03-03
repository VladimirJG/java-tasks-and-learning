package yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Task1 {
    public static void main(String[] args) {
        String s = "Hello, world!";
        String t = "";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String m = String.valueOf(s.charAt(i));
            if (!t.contains(m) && !m.equals(" ") && !m.equals("\n")) {
                list.add(m);
                t+=m;
            }
        }
        System.out.println(t);
        Arrays.sort(t.toCharArray());
        Collections.sort(list);
        System.out.print(list);
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String m = list.get(i);
            for (int i1 = 0; i1 < s.length(); i1++) {
                String n = String.valueOf(s.charAt(i1));
                if (m.equals(n)) {
                    list2.add("#");
                }
            }
            list2.add(m);
        }
    }
}

