package JavaR2.multithread;

//1. Создать public static класс TestThread, унаследованный от класса Thread.
//2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
//3. Метод run должен выводить в консоль "it's a run method".
public class Task4 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();

    }

    public static class TestThread extends Thread {
        public TestThread() {

        }

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }
}
