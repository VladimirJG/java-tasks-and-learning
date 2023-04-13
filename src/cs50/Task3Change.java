package cs50;

import java.io.IOException;
import java.util.Scanner;

//Дано: монетки номиналом 25, 10, 5, 1 цент
//
//Программа должна:
//
//Спросить пользователя, сколько сдачи нужно выдать.
//Посчитать минимальное количество монет, с помощью которых можно это сделать
public class Task3Change {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] monetChange = {25, 10, 5, 1};
        System.out.println("Сколько сдачи нужно выдать?");
        double dChange = scanner.nextDouble() * 100;
        if (dChange > 0) {
            countingCoins(monetChange, dChange);
        }
    }

    public static void countingCoins(int[] monetChange, double dChange) {
        int intChange = (int) dChange;
        int count = 0;
        for (int j : monetChange) {
            while (intChange >= j) {
                intChange -= j;
                count++;
            }
        }
        System.out.println(count);
    }
}

