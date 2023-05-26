package sinergy.modul_3.task2;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ALM<>();
        list.add("Hara");
        list.add("Injection");
        list.add("Trouble");
        list.add("Hara");
        list.add("Injection");
        list.add("Trouble");
        list.add("Hara");
        list.add("Injection");
        list.add("Trouble");list.add("Hara");
        list.add("Injection");
        list.add("Trouble");list.add("Hara");
        list.add("Injection");
        list.add("Trouble");list.add("Hara");
        list.add("Injection");


        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.remove(2));
        System.out.println(list.size());
    }
}
