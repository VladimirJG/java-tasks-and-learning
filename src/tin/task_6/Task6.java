package tin.task_6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = scanner.nextInt();
        int[] people = new int[countPeople];
        for (int i = 0; i < people.length; i++) {
            people[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] % 2 == 0) {
                count++;
            }
        }
        if (countPeople / 2 == count || countPeople / 2 == count + 1 || countPeople / 2 == count - 1) {
            int count1 = 0;
            for (int i = 0; i < people.length; i++) {
                if (i % 2 == people[i] % 2) {
                    count1++;
                }
            }
            if (count1 == 2) {
                for (int i = 0; i < people.length; i++) {
                    if (i % 2 == people[i] % 2) {
                        System.out.println(people[i]);
                    } else {
                        System.out.println("-1 - 1");
                    }
                }
            } else {
                System.out.println("-1 - 1");
            }
        } else {
            System.out.println("-1 - 1");
        }
    }
}
