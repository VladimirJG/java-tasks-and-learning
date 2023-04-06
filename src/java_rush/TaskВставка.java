package java_rush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskВставка {
    public static void main(String[] args) {
        String[] arr = {"mama", "mila", "ramu"};

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); i++) {
            System.out.println("именно" +" " + list.get(i));
        }
    }
}