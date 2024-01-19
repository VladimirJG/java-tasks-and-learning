package tin.eternal_contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amtNumbers = scanner.nextInt();
        int limitOperation = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Long> longList = new ArrayList<>();

        for (int i = 0; i < amtNumbers; i++) {
            list.add(scanner.nextInt());
        }
        for (Integer num : list) {
            int weight = 1;
            while (num > 0) {
                int digit = num % 10;
                long gain = (long) (9 - digit) * weight;
                longList.add(gain);
                weight *= 10;
                num /= 10;
            }
        }
        System.out.println(longList);

    }

}
