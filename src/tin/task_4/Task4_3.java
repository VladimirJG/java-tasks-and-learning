package tin.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("7 2 90528 9251 1 31 88915 5885 6989");
        int k = scanner.nextInt(); // количество чисел на бумажке
        long n = scanner.nextLong(); // ограничение на число операций
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(scanner.nextInt());
        }
        sortedList(list);
        comparison(sortedList(list));
    }

    public static ArrayList<Integer> sortedList(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String numLength = String.valueOf(list.get(i));
            String lastNumLength = String.valueOf(list.get(list.size() - 1));
            if (numLength.length() == lastNumLength.length()) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    public static void comparison(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            String num = String.valueOf(list.get(i));
            String endNum = String.valueOf(list.get(list.size() - 1));
            int intNum = Integer.parseInt(num);
            int intEndNum = Integer.parseInt(endNum);

            for (int i1 = 0; i1 < endNum.length(); i1++) {
                if (Character.getNumericValue(endNum.charAt(i1)) < 9) {
                   // endNum.charAt(i1) = 9;
                    System.out.println(intNum);
                }

            }

        }
    }

    public static void printList(ArrayList<Integer> list) {
        System.out.println(list);
    }
}

   /* String s = "1166628";

    Integer i = Integer.parseInt(s);

   System.out.println(i);*/