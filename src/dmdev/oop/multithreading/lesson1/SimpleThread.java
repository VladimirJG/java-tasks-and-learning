package dmdev.oop.multithreading.lesson1;

public class SimpleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
