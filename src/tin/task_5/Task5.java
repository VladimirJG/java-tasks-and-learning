package tin.task_5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("10  10000000");
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        long count = 0;
        for (int i = (int) start; i <= (int) end; i++) {
            long length = String.valueOf(i).length();
            StringBuilder one = new StringBuilder();
            long num = 0;
            for (int j = 0; j < length; j++) {
                one.append("1");
                num = Long.parseLong(String.valueOf(one));
            }
            if (i % num == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
