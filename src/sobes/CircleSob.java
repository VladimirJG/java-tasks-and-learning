package sobes;

public class CircleSob {
    public static void main(String[] args) {
        Circle sample = new Circle();
        Circle newSample = sample;
        newSample.radius= 1000;
        System.out.println(sample.radius);
    }

    static class Circle {
        int radius = 50;
        int len = 75;
    }
}
