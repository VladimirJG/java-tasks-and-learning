package Alishev.multitreading;

import java.util.Scanner;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify {
    public void producer() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer starting");
            wait(); // 1 - отдаем intrinsic lock; 2 - ждем notify
            System.out.println("Producer resumed");
        }
    }

    public void consumer() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for enter key pressed");
            scanner.nextLine();
            notify();

            for (int i = 5; i > 0; i--) {
                System.out.println("Transition to producer to go to " + i + " sec");
                Thread.sleep(1000);
            }
        }
    }
}