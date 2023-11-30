package tin.eternal_contest;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        int moves = 1;
        while (n > 1) {
            moves++;
            n /= 2;
        }
        System.out.println(moves);
    }
}
