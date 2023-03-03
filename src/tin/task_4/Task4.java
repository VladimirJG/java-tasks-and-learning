package tin.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("7 2 90528 9251 1 31 88915 5885 6989");
        int k = scanner.nextInt(); // количество чисел на бумажке
        long n = scanner.nextLong(); // ограничение на число операций

        int[] array = new int[k];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = sortedArray(array);
        sortedArray2(list,n);
    }

    public static ArrayList<Integer> sortedArray(int[] array) {
        Arrays.sort(array);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            String m = String.valueOf(list.get(i));
            String m1 = String.valueOf(list.get(0));
            int[] arr = new int[m.length()];
            if (m.length() > m1.length()) {
                for (int i1 = 0; i1 < arr.length; i1++) {
                    arr[i1] = m.charAt(i1);
                }
               /* for (int i1 = 0; i1 < arr.length - 1; i1++) {
                    int b = array[i1];
                    if (b < 9) {
                        list1.add(0, Integer.valueOf(m));
                        break;
                    }
                }*/
            }
        }
        //System.out.println(list);
        //
        // System.out.println(list1);
        return list;
    }
    public static void sortedArray2(ArrayList<Integer> list, long n){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String m  = String.valueOf(list.get(i));
            String m1 = String.valueOf(list.get(list.size()-1));
            if (m.length() == m1.length()){
                list1.add(list.get(i));
                System.out.println(list1);
            }
        }
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {

        }
    }
}
