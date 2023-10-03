package sinergy.module_4.hw_1;

public class Counter implements Runnable {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        Thread thread2 = new Thread(counter);
        thread.start();
        thread2.start();
    }

    int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getValue() {
        return count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
            System.out.println(getValue());
        }
    }
}

