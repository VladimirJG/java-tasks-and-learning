package other_task_leet_code.easy;

import java.util.Arrays;

//Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел так, чтобы они составляли в суммеtarget .
//Вы можете предположить, что каждый вход будет иметь ровно одно решение , и вы не можете использовать один и тот же элемент дважды.
//Вы можете вернуть ответ в любом порядке.
//Пример 1:
//Ввод: nums = [2,7,11,15], target = 9
// Вывод: [0,1]
// Объяснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].
//Пример 2:
//
//Ввод: числа = [3,2,4], цель = 6
// Вывод: [1,2]
//Пример 3:
//
//Ввод: числа = [3,3], цель = 6
// Вывод: [0,1]
//
//Ограничения:
//2 <= nums.length <= 104
//-109 <= nums[i] <= 109
//-109 <= target <= 109
//Существует только один правильный ответ.
//
//Дополнение: можете ли вы придумать алгоритм,  сложность которого меньше временной?
public class Task1_1TwoSum {
    public static void main(String[] args) {
        int[] nums = {11, 7, 15, 2};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
