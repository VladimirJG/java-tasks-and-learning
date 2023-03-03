package tin.task_3;

import java.util.Scanner;

public class Task3_2 {
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
        int result = 0;
        for (int i = 1; i < floors.length; i++) {
            res = floors[i] - floors[i - 1];
        }

        if (timeOut <= res && floorTimeOut >= floors[floors.length - 1]) {

            result = (floorTimeOut - floors[floors.length - 1]) + res;

        } else if (floorTimeOut < floors[0]) {
            result = (floors[0] - floorTimeOut) + res;
        }
        int val1 = 0;
        int val2 = 0;
        for (int i = 1; i < floors.length; i++) {
            if (floors[i - 1] <= floorTimeOut && floors[i] > floorTimeOut) {
                if (i > floors.length / 2) {
                    for (int j = floors.length / 2 + 1; j < floors.length; j++) {
                        val1 = floors[j - 1] + floors[j];
                    }
                }
                for (int j = floors[1]; j < floors.length / 2; j++) {
                    val2 = floors[j-1] + floors[j];
                }
            }
        }
        result = val1 + val2;
        System.out.println(result);
    }
}
