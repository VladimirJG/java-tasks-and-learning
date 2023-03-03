package tin;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long quantityPeople = scanner.nextLong();
        int count = 0;
        while (quantityPeople / 2 != 0) {
            if (quantityPeople % 2 == 0) {
                quantityPeople = quantityPeople / 2;
                count++;
            } else {
                quantityPeople = quantityPeople / 2;
                count += 2;

            }
        }
        System.out.println(count);
    }
}
