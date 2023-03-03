package tin.task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); // количество чисел на бумажке
        long n = scanner.nextLong(); // ограничение на число операций
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(scanner.nextInt());
        }
        endNumber(sortAndAdd(list), list, n);
    }

    public static ArrayList<Integer> sortAndAdd(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String m = String.valueOf(list.get(i));
            int[] array = new int[m.length()];
            for (int i1 = 0; i1 < array.length; i1++) {
                array[i1] = Character.getNumericValue(m.charAt(i1));
            }
            for (int i1 = 0; i1 < array.length; i1++) {
                if (array[i1] != 9) {
                    array[i1] = 9;
                    break;
                }
            }
            StringBuilder string = new StringBuilder();
            for (int i1 = 0; i1 < array.length; i1++) {
                string.append(array[i1]);
            }
            Integer num = Integer.parseInt(String.valueOf(string));
            list1.add(num);
        }
        return list1;
    }

    public static void endNumber(ArrayList<Integer> list, ArrayList<Integer> list1, long n) {
        ArrayList<Integer> lis = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            lis.add(list.get(i) - list1.get(i));
        }
        Collections.sort(lis);
        Collections.reverse(lis);

        int res = 0;
        if (n <= lis.size()) {
            for (int i = 0; i < n; i++) {
                res += lis.get(i);
            }
        } else {
            for (int i = 0; i <= lis.size() - 1; i++) {
                res += lis.get(i);
            }
        }

        System.out.println(res);
    }
}





