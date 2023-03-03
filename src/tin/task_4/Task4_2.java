package tin.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("2");
        long n = scanner.nextLong(); // ограничение на число операций
        ArrayList<Integer> list = addList();
        sortedList(list);
        comparison(sortedList(list));
    }

    public static ArrayList<Integer> addList() {
        Scanner scanner = new Scanner("7 90528 9251 1 31 88915 5885 6989");
        int k = scanner.nextInt(); // количество чисел на бумажке

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(scanner.nextInt());
        }
        return list;
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
        int[] arrNum;
        int[] arrEnd ;
        for (int i = 0; i < list.size()-1; i++) {
            String num = String.valueOf(list.get(i));
            String endNum = String.valueOf(list.get(list.size()-1));
            arrNum = new int[num.length()];
            arrEnd = new int[endNum.length()];
            for (int i1 = 0; i1 < arrNum.length; i1++) {
                arrNum[i1] = Character.getNumericValue(num.charAt(i1));
            }
            for (int i1 = 0; i1 < arrEnd.length; i1++) {
                arrEnd[i1] = Character.getNumericValue(endNum.charAt(i1));
            }
            for (int i1 = 0; i1 < arrEnd.length-1; i1++) {
                if (arrEnd[i1]<9){
                    arrEnd[i1] = 9;
                    String u = Arrays.toString(arrEnd);
                    Integer e = Integer.parseInt(u);
                    System.out.println(e);
                }
            }
        }

    }

    public static void printList(ArrayList<Integer> list) {
        System.out.println(list);
    }
}
