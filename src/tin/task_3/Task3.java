package tin.task_3;

import java.util.Scanner;

public class Task3 {
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
            res += floors[i] - floors[i - 1];
            if (timeOut <= res) {


            }else {

                if (floorTimeOut > floors[floors.length - 1]) {
                    if (timeOut < res + (floorTimeOut - floors[floors.length - 1])) {
                        result = floorTimeOut - floors[floors.length - 1] + res;
                    } else {
                        result = res + floorTimeOut - floors[floors.length - 1];
                    }

                } else if (floorTimeOut < floors[0]) {
                    result = (floors[0] - floorTimeOut) + res;
                } else {
                    result = res;
                }
            }
        }
        System.out.println(result);
    }
}
