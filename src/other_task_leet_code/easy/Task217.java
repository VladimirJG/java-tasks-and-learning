package other_task_leet_code.easy;

import java.util.Arrays;

/*
Учитывая целочисленный массив nums, возвращайте значение true, если какое-либо значение встречается в
массиве хотя бы дваждыfalse , и возвращайте значение , если каждый элемент различен.



Пример 1:

Ввод: nums = [1,2,3,1]
 Вывод: true
Пример 2:

Ввод: nums = [1,2,3,4]
 Вывод: ложь
Пример 3:

Ввод: nums = [1,1,1,3,3,4,3,2,4,2]
 Выход: true


Ограничения:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class Task217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        int[] array = Arrays.stream(nums).distinct().toArray();
        return !(nums.length == array.length);
    }
}
