package dmdev.oop.string;

public class SBAAndCurrentTimeMiles {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder stringB = new StringBuilder();
        for (int i = 0; i < 100_000_0; i++) {
            stringB.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}
