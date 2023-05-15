package dmdev.oop.multithreading.lesson1;

public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start(); //метод run, но именно для этого потока
        try {
            simpleThread.join(); // все потоки будут ждать пока этот поток не завершится
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
