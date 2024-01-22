package Alishev.multitreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedBlock {
    public static void main(String[] args) {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    public void addList1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list1.add(random.nextInt(1, 50));
    }

    public void addList2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        list2.add(random.nextInt(1, 50));
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addList1();
            addList2();
        }
    }

    public void main() {
        long before = System.currentTimeMillis();
        work();
        long after = System.currentTimeMillis();
        System.out.println("times begin: " + (after - before) + " ms");
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
}
