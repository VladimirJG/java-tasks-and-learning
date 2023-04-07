package JavaR2;

import java.util.*;

//1. Создай список чисел.
//2. Добавь в список 10 чисел с клавиатуры.
//3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
//
//Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
//3
public class TaskПоследовательностьЗначений {
    public static void main(String[] args) {
        Scanner sc = new Scanner("2 4 4 4 4 8 4 8 4 12 12 12 12 12 14");//"2, 4, 4, 4, 8, 8, 4, 12, 12, 14"
        int[] arr = new int[15];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            list.add(arr[i]);
        }
        int count = 1;
        int result = 0;
        for (int i = 0; i < 14; i++) {
            if (list.get(i) == list.get(i + 1)) {
                count++;
                if (count > result) {
                    result = count;
                }
            }
            if (list.get(i) != list.get(i + 1)){
                count=1;
            }
        }
        System.out.println(result);
    }
}
