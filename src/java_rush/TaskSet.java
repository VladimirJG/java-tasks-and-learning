package java_rush;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaskSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("yes");
        set.add("it");
        set.add("is");
        set.add("yo");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
