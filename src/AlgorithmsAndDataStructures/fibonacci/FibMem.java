package AlgorithmsAndDataStructures.fibonacci;

import java.util.Arrays;

public class FibMem {
    public static void main(String[] args) {
        int n = 2;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -5);
        System.out.println(fibMem(n, mem));
    }

    private static long fibMem(int n, long[] mem) {
        if (n <= 1)
            return n;

        if (mem[n] != -5)
            return mem[n];

        long result = fibMem(n - 1, mem) + fibMem(n - 2, mem);
        mem[n] = result;
        return result;
    }
}
