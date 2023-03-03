package tin.task_3;

import java.util.Scanner;

public class Task3_6 {
    public static void main(String[] args) {
        /*int a = 5; //количество сотрудников
        int b = 5; // время когда сотрудник уйдет
        int c0 = 1;
        int c1 = 4;
        int c2 = 9;
        int c3 = 16;
        int c4 = 25;  // этажи
        int sot = 2; //номер этажа сотр который уйдет первым через b минут*/

        Scanner scanner = new Scanner("13 4 1 5 9 16 18 24 31 54 59 65 72 83 92 68");
        int countFloors = scanner.nextInt();
        int timeOut = scanner.nextInt();
        int[] floors = new int[countFloors];
        for (int i = 0; i < floors.length; i++) {
            floors[i] = scanner.nextInt();
        }
        int floorTimeOut = scanner.nextInt();
        int resIndex = 0;
        int minutes = 0;

        for (int i = 1; i < floors.length; i++) {
            minutes += floors[i] - floors[i - 1];
            if (floors[i - 1] <= floorTimeOut && floors[i] >= floorTimeOut) {
                resIndex = i;
            }
        }
// блок вычисления значений половин массива
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        int firstLength = 0, c = 0;
        int secondLength = 0;
        for (int i = 1; i < floors.length / 2; i++) {
            firstLength += (floors[i] - floors[i - 1]);
        }
        for (int i = floors.length / 2 + 1; i < floors.length; i++) {
            secondLength += (floors[i] - floors[i - 1]);
        }
//_______________________________________________________________

//блок вычесления кратчайшего времени
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //if (timeOut < minutes) {

            if (resIndex <= floors.length / 2) {
                for (int i = floors[1]; i <= resIndex; i++) {
                    c += (floors[i] - floors[i - 1]);
                }
            } else {
                for (int i = resIndex + 1; i < floors.length; i++) {
                    c += (floors[i] - floors[i - 1]);
                }
            }
            c += minutes;
        //}
//_____________________________________________________________________
        System.out.println(c);
        System.out.println(resIndex);
        System.out.println(minutes);
    }
}