package tin.task_5;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("10 111");
        long start = scanner.nextLong();
        long end = scanner.nextLong();
        int count = 0;


        for (int i = (int) start; i <= (int) end; i++) {
            if (i%11 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}