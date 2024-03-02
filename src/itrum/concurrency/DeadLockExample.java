package itrum.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {

    private static class Resource {// Ресурсы
    }

    private final Resource resourceA = new Resource();
    private final Resource resourceB = new Resource();

    private final Lock lockA = new ReentrantLock();
    private final Lock lockB = new ReentrantLock();


    public void execute() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                esquireResourcesAndWork(lockA, lockB, resourceA, resourceB, "Thread-1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                esquireResourcesAndWork(lockA, lockB, resourceA, resourceB, "Thread-2"); // здесь была ошибка DeadLock
            }
        });
        thread1.start();
        thread2.start();

        // и впринципе для подстраховки можно потоки джойнить
    }

    private void esquireResourcesAndWork(Lock firstLock, Lock secondLock, Resource firstResource, Resource secondResource, String threadName) {
        firstLock.lock();
        System.out.println(threadName + " locked " + firstResource);

        try {
            Thread.sleep(1000);

            secondLock.lock();
            System.out.println(threadName + " locked " + secondLock);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                secondLock.unlock();
                System.out.println(threadName + " unlocked " + secondResource);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            firstLock.unlock();
            System.out.println(threadName + " unlocked " + firstResource);
        }
    }

    public static void main(String[] args) {
        DeadLockExample example = new DeadLockExample();
        example.execute();
    }
}
