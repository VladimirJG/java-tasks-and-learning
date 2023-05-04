package other_task_leet_code.easy;

import java.util.*;

//Пример 1:
//
//Ввод: nums = [1,1,2]
// Вывод: 2, nums = [1,2,_]
// Объяснение: Ваша функция должна возвращать k = 2, причем первые два элемента nums равны 1 и 2 соответственно.
//Неважно, что вы оставляете за возвращенным k (следовательно, это символы подчеркивания).
//Пример 2:
//
//Ввод: числа = [0,0,1,1,1,2,2,3,3,4]
// Выход: 5, числа = [0,1,2,3,4,_,_,_,_, _]
// Объяснение: Ваша функция должна возвращать k = 5,
// причем первые пять элементов nums равны 0, 1, 2, 3 и 4 соответственно.
//Неважно, что вы оставляете за возвращенным k (следовательно, это символы подчеркивания).
public class Task26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        nums = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }
}
