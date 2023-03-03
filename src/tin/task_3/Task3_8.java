package tin.task_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3_8 {
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
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < countFloors; i++) {
            list.add(scanner.nextInt());
        }
        int floorTimeOut = scanner.nextInt();

        addFloorTimeOut(list, floorTimeOut);
       // endOfRun(list, floorTimeOut, timeOut);
        //firstPartList(list, floorTimeOut, timeOut);
        secondPartList(list, floorTimeOut);

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

    //рассчет первой части листа
    public static void firstPartList(ArrayList<Integer> list, int floorTimeOut, int timeOut) {
        int minutes = 0;
        int index = 0;
        int result = 0;
        for (int i = 1; i < list.size() / 2; i++) {
            minutes += list.get(i) - list.get(i - 1);
        }
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i) == floorTimeOut) {
                index = i;
            }
        }
        if (floorTimeOut > timeOut && floorTimeOut != list.get(0)) {
            for (int i = index; i > 0; i--) {
                result += list.get(i) - list.get(i - 1);
            }
            result += totalTime(list);
        } else {
            result = totalTime(list);
        }

        System.out.println(result);
    }

    public static void secondPartList(ArrayList<Integer> list, int floorTimeOut) {
        int minutes = 0;
        int index = 0;
        int result = 0;
        for (int i = list.size() / 2 + 2; i < list.size(); i++) {
            minutes += list.get(i) - list.get(i - 1);

        }
        for (int i = list.size() / 2 + 1; i < list.size(); i++) {
            if (list.get(i) == floorTimeOut) {
                index = i;
            }
        }
        for (int i = index; i < list.size() - 1; i++) {
            result += list.get(i + 1) - list.get(i);
        }
        result += totalTime(list);
        System.out.println(result);
    }


    public static void endOfRun(ArrayList<Integer> list, int floorTimeOut, int timeOut) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == floorTimeOut) {
                index = i;
            }
        }
        if (index < list.size() / 2) {
            firstPartList(list, floorTimeOut, timeOut);
        } else {
            secondPartList(list, floorTimeOut);
        }
    }

    public static int totalTime(ArrayList<Integer> list) {
        return list.get(list.size() - 1) - list.get(0);
    }
}