package AlgorithmsAndDataStructures.recursion;

public class Recursion {
    public static void main(String[] args) {
//        counter(3);
        System.out.println(factorial(4));
    }

    private static void counter(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        counter(n - 1);
    }

    // factorial 4 = 4 * 3 * 2 * 1
    private static int factorial(int n) {
        if (n == 1)
            return 1;
        System.out.println(n);
        return n * factorial(n - 1);
    }
}
