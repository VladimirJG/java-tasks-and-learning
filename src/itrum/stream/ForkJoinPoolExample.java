package itrum.stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class FactorialTask extends RecursiveTask<Long> {
    private int n;

    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return 1L;
        } else {
            FactorialTask task = new FactorialTask(n - 1);
            task.fork();
            return n * task.join();
        }
    }
}


public class ForkJoinPoolExample {
    public static void main(String[] args) {
        int n = 20; // Вычисление факториала для числа 10

        ForkJoinPool forkJoinPool = new ForkJoinPool(5);
        FactorialTask factorialTask = new FactorialTask(n);

        long result = forkJoinPool.invoke(factorialTask);

        System.out.println("Факториал " + n + "! = " + result);
    }
}
