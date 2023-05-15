package dmdev.oop.multithreading.lesson1;

public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());

        simpleThread.start(); //метод run, но именно для этого потока
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());

        // RunnableThread runnableThread = new RunnableThread();//1
        Thread runnableThread2 = new Thread(new RunnableThread(), "My name");
        Thread lambdaThread = new Thread(() -> System.out.println("Lambda" + Thread.currentThread().getName()));

        runnableThread2.start();
        lambdaThread.start();
        try {
            simpleThread.join(); // все потоки будут ждать пока этот поток не завершится
            System.out.println(simpleThread.getName() + " " + simpleThread.getState());
            //  runnableThread.start//1 не запуститься через start, тк должен быть реализован через Thread
            runnableThread2.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
