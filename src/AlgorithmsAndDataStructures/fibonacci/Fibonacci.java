package AlgorithmsAndDataStructures.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(50));
    }

    private static long fibNaive(int n) {
        if (n <= 1)
            return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
}
