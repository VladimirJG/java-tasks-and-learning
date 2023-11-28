package Alishev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mike");
        list.add("Ted");
        list.add("Tom");
        list.add("Katty");
        list.add("John");

//        Collections.sort(list, new MyComparator());

//        list.sort(new MyComparator());

//        Collections.sort(list,new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length())
//                    return 1;
//                else if (o1.length() < o2.length())
//                    return -1;
//                else
//                    return 0;
//            }
//        });

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}

class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length())
            return 1;
        else if (o1.length() < o2.length())
            return -1;
        else
            return 0;
    }
}
