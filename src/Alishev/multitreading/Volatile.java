package Alishev.multitreading;

import java.util.Scanner;

public class Volatile {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start();

        Thread thread = new Thread(new MyClass2());
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myClass.exit();
    }
}

class MyClass2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("myClass2" + i);
        }
    }
}
class MyClass extends Thread {
    private volatile boolean running = true; // добавить volatile и когерентность будет правильная - не буде в кэ
    // 2 ядра записано неверное состояние переменной.... бля  просто вспомни когерентность.
    private int count = 0;

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(300);
                count++;
                System.out.println(count);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void exit() {
        this.running = false;
    }
}

