package other_task_leet_code;
//35. Search Insert Position

//Учитывая отсортированный массив различных целых чисел и целевое значение,
// вернуть индекс, если цель найдена. Если нет, верните индекс туда, где он был бы, если бы он был вставлен по порядку.
//
//Вы должны написать алгоритм со  O(log n)сложностью выполнения.

import java.util.Arrays;

//Пример 1:
//
//Ввод: числа = [1,3,5,6], цель = 5
// Вывод: 2
//Пример 2:
//
//Ввод: числа = [1,3,5,6], цель = 2
// Вывод: 1
//Пример 3:
//
//Ввод: числа = [1,3,5,6], цель = 7
// Вывод: 4
public class Task35 {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 3;
        System.out.println(searchInsert(nums, target));


    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        if (target <= nums[0]) {
            index = 0;
        } else if (nums.length == 1 && target > nums[0]) {
            index = 1;
        } else if (target > nums[nums.length - 1]) {
            index = nums.length;
        }
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i - 1]) {
                index = i - 1;
            } else if (target > nums[i - 1] && target <= nums[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}