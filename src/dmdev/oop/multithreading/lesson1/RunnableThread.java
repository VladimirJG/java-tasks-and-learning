package dmdev.oop.multithreading.lesson1;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable " + Thread.currentThread().getName());
    }
}
