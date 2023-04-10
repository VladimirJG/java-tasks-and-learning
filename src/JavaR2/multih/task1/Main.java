package JavaR2.multih.task1;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("Пентуфиций");
        Thread childThread = new Thread(printer);
        childThread.start();

        Printer printer1 = new Printer("Иузефорий");
        Thread childThread1 = new Thread(printer1);
        childThread1.start();

        Printer printer2 = new Printer("Галамкурий");
        Thread childThread2 = new Thread(printer2);
        childThread2.start();

        Printer printer3 = new Printer("Пентуфиций");
        Thread childThread3 = new Thread(printer);
        childThread3.start();
    }
}
