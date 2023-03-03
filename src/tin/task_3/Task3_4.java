package tin.task_3;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        /*int a = 5; //количество сотрудников
        int b = 5; // время когда сотрудник уйдет
        int c0 = 1;
        int c1 = 4;
        int c2 = 9;
        int c3 = 16;
        int c4 = 25;  // этажи
        int sot = 2; //номер этажа сотр который уйдет первым через b минут*/

        Scanner scanner = new Scanner("13 4 1 2 3 6 8 10 15 16 19 21 22 23 25 13");
        int countFloors = scanner.nextInt();
        int timeOut = scanner.nextInt();
        int[] floors = new int[countFloors];
        for (int i = 0; i < floors.length; i++) {
            floors[i] = scanner.nextInt();
        }
        int floorTimeOut = scanner.nextInt();
        int resNumber = 0;
        int resIndex = 0;
        int minutes = 0;

        for (int i = 1; i < floors.length; i++) {
            minutes += floors[i] - floors[i - 1];
            if (floors[i - 1] < floorTimeOut && floors[i] > floorTimeOut) {
                resNumber = floors[i];
                resIndex = i;
            }
        }
        int v = 0, c = 0;
        int v1 = 0, c1 = 0;
        int v2 = 0, c2 = 0;

        for (int i = 1; i < floors.length / 2; i++) {
            v1 += (floors[i] - floors[i - 1]);
        }

        for (int i = floors.length / 2 + 1; i < floors.length; i++) {
            v2 += (floors[i] - floors[i - 1]);
        }

        if (resIndex == floors.length / 2) {
            for (int i = floors.length / 2 + 1; i < floors.length; i++) {
                v += (floors[i] - floors[i - 1]);
            }
            v += (resNumber - floorTimeOut);
        } else if (resIndex <= floors.length / 2) {
            for (int i = floors[1]; i <= resIndex; i++) {
                c1 += (floors[i] - floors[i - 1]);
            }
            c1 += minutes;
        } else {
            for (int i = resIndex + 1; i < floors.length; i++) {
                c2 += (floors[i] - floors[i - 1]);
            }
            c2 += minutes;
        }

        System.out.println(c1);
        System.out.println(floors.length/2);
    }
}