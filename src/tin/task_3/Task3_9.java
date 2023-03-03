package tin.task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("5 5 3 4 9 16 25 5");
        int countFloors = scanner.nextInt();
        int timeOut = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < countFloors; i++) {
            list.add(scanner.nextInt());
        }
        int floorTimeOut = scanner.nextInt();

        addFloorTimeOut(list, floorTimeOut);
        end(list,floorTimeOut,timeOut);
    }

    // запихиваем в лист этаж сотрудника
    public static ArrayList<Integer> addFloorTimeOut(ArrayList<Integer> list, int floorTimeOut) {
        int indexBig = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) < floorTimeOut && list.get(i) > floorTimeOut) {
                indexBig = i;
            }
        }
        list.add(indexBig, floorTimeOut);
        return list;
    }

    public static void end(ArrayList<Integer> list, int floorTimeOut, int timeOut) {
        int sumOfFloors = 0;
        for (int i = 1; i < list.size(); i++) {
            sumOfFloors += list.get(i) - list.get(i - 1);
        }
        if (timeOut < floorTimeOut) {
            int result = 0;
            if ((floorTimeOut - list.get(0)) < (list.get(list.size() - 1) - floorTimeOut)) {
                for (int i = floorTimeOut; i > 0; i--) {
                    result += list.get(i) - list.get(i - 1);
                }
                result += sumOfFloors;
            } else if ((floorTimeOut - list.get(0)) >= (list.get(list.size() - 1) - floorTimeOut)) {
                for (int i = floorTimeOut; i < list.size() - 2; i++) {
                    result += list.get(i + 1) - list.get(i);
                }
                result += sumOfFloors;
            }
            System.out.println(result);
        } else {
            System.out.println(sumOfFloors);
        }
    }
}