package cs50;

import java.util.Scanner;

public class Task2Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number >= 0 && number <= 23) {
                for (int i = 0; i < number; i++) {
                    for (int n = number - i; n > 0; n--) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("#");
                    }
                    System.out.println("##");
                }
                break;
            } else {
                System.out.print("Please enter the number again:");
            }
        }
    }
}
