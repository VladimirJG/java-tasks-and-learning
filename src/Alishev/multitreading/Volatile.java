package Alishev.multitreading;

import java.util.Scanner;

public class Volatile {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myClass.exit();
    }
}

class MyClass extends Thread {
    private boolean running = true;
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

