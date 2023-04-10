package JavaR2.multithread.task9ClockOff;

public class Clock implements Runnable {
    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tic");
            if (!ClockManager.isClock) {
                return;
            }
        }
    }
}
