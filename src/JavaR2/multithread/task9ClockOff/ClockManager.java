package JavaR2.multithread.task9ClockOff;

public class ClockManager {
    public static boolean isClock = true;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread threadClock = new Thread(clock);
        threadClock.start();


        Thread.sleep(10000);
        isClock = false;
    }
}
