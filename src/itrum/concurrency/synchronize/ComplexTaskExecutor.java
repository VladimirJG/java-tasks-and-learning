package itrum.concurrency.synchronize;

import java.util.concurrent.*;

public class ComplexTaskExecutor {

    private final CyclicBarrier barrier;
    private final ExecutorService service;

    public ComplexTaskExecutor(int numberOfThreads) {
        this.barrier = new CyclicBarrier(numberOfThreads);
        this.service = Executors.newFixedThreadPool(numberOfThreads);
    }

    public void executeTasks(int numberOfThreads) {
        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                ComplexTask complexTask = new ComplexTask();
                complexTask.execute();
                try {
                    barrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        try {
            service.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
