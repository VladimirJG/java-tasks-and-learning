package testany.stack;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StackMy stackMy = new StackMy();
        List<Integer> list = stackMy.create();
        System.out.println(list);
    }
}
