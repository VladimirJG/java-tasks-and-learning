package tin;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long quantityPeople = scanner.nextInt();
        int e = 0;
        long p = 1;
        while (p < quantityPeople) {
            e += 1;
            p *= 2;

        }
        System.out.println(e);
    }
}
