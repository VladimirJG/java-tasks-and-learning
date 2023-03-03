package tin.task_3;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        /*int a = 5; //количество сотрудников
        int b = 5; // время когда сотрудник уйдет
        int c0 = 1;
        int c1 = 4;
        int c2 = 9;
        int c3 = 16;
        int c4 = 25;  // этажи
        int sot = 2; //номер этажа сотр который уйдет первым через b минут*/

        Scanner scanner = new Scanner("6 4 1 2 3 6 8 25 5");
        int countFloors = scanner.nextInt();
        int timeOut = scanner.nextInt();
        int[] floors = new int[countFloors];
        for (int i = 0; i < floors.length; i++) {
            floors[i] = scanner.nextInt();
        }
        int floorTimeOut = scanner.nextInt();
        int res = 0;
        int res1 = 0;

        for (int i = 1; i < floors.length; i++) {
            if (floors[i - 1] < floorTimeOut && floors[i] > floorTimeOut) {
                res = floors[i];
                res1 = i;
            }
        }
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        if (res1 == floors.length / 2) {
            for (int i = floors.length / 2 + 1; i < floors.length; i++) {
                v += (floors[i] - floors[i - 1]);
            }
            v += (res - floorTimeOut);
        } else if (res1 < floors.length / 2) {
            for (int i = 1; i < floors.length / 2; i++) {
                v1 += (floors[i] - floors[i - 1]);
            }
        } else  {
            for (int i = floors.length / 2 + 1; i < floors.length; i++) {
                v2 += (floors[i] - floors[i - 1]);
            }
        }

        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
    }
}