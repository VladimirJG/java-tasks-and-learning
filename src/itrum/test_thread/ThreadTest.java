package itrum.test_thread;

public class ThreadTest implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("iteration # " + i);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Runnable test = new ThreadTest();
        Thread thread = new Thread(test);
        thread.start();
    }
}
