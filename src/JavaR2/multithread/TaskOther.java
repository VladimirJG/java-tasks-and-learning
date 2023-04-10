package JavaR2.multithread;

public class TaskOther {
    public static void main(String[] args) throws InterruptedException {
        while (true){
           int n = (int)(Math.random() * 10);
            Thread.sleep(1500);
            System.out.println(n);
        }
    }
}
