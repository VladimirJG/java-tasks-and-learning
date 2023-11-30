package tin.eternal_contest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src", "number");
        List<Integer> numbers = inputField(file);
        boolean check = false;
        for (Integer num : numbers) {
            if (num == 0) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Вводимые данные должны превышать значение 0");
        } else {
            int tariffCost = numbers.get(0);
            int tariffSize = numbers.get(1);
            int priceExtraMB = numbers.get(2);
            int internetTrafficSizeNextMonth = numbers.get(3);

            int excessTraffic = (internetTrafficSizeNextMonth - tariffSize);
            if (excessTraffic > 0)
                System.out.println(excessTraffic * priceExtraMB + tariffCost);
            else System.out.println(tariffCost);
        }
    }

    public static List<Integer> inputField(File file) {
        try (Scanner scanner = new Scanner(file)) {
            String line = scanner.nextLine();
            String[] num = line.split(" ");
            return Arrays.stream(num).map(Integer::parseInt).toList();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
