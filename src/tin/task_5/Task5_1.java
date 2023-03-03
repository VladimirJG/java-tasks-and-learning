package tin.task_5;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        long count = 0;
        StringBuilder one = new StringBuilder("1");

        for (int i = (int) start; i <= (int) end; i++) {
            long length = String.valueOf(i).length();
            while (length > one.length()) {
                one.append("1");
            }
            long num = Long.parseLong(one.toString());
            if (i % num == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}