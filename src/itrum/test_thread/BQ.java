package itrum.test_thread;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BQ {
    List<Integer> queue = new LinkedList<>();
    Integer maxSize = 5;

    public synchronized void enqueue(Integer element) throws InterruptedException {
        if (queue.size() == maxSize) {
            notifyAll();
            dequeue();
        }
        queue.add(element);
        System.out.println("Элемент " + element + " добавлен под № " + queue.size() + " очереди ");
    }

    public synchronized void dequeue() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer element = queue.get(size - 1);
            queue.remove(size - 1);
            System.out.println("Элемент " + element + " удален из ячейки " + size + " очереди");
        }
    }
}

class Example {
    public static void main(String[] args) {


        BQ bq = new BQ();
        Scanner scanner = new Scanner(System.in);
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (scanner.hasNext()) {
                        bq.enqueue(scanner.nextInt());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bq.dequeue();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
