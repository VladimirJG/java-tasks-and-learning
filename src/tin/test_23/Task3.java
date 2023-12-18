package tin.test_23;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int credit = scanner.nextInt();
        for (int i = 0; i < size;) {
            int price = scanner.nextInt();
            if (credit >= price) {
                credit = credit - price;
            }
            i++;
        }
        System.out.println(credit);
    }
}
