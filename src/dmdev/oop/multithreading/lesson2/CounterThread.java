package dmdev.oop.multithreading.lesson2;

public class CounterThread extends Thread{
    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }
}
