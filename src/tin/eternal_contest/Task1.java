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
        System.out.println(numbers);
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
