package other_task_leet_code.easy;

import java.util.ArrayList;
import java.util.List;

/*
Учитывая непустой  массив целых чисел nums, каждый элемент появляется дважды , кроме одного. Найдите этого единственного.

Вы должны реализовать решение с линейной сложностью времени выполнения и использовать только постоянное дополнительное пространство.


Пример 1:

Ввод: nums = [2,2,1]
 Вывод: 1
Пример 2:

Ввод: nums = [4,1,2,1,2]
 Вывод: 4
Пример 3:

Ввод: nums = [1]
 Вывод: 1


Ограничения:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Каждый элемент массива появляется дважды, за исключением одного элемента, который появляется только один раз.
 */
public class Task136 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 2, 1, 1, 2};
        int n = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int count = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            int l = list.get(i);
            int m = nums[j];
            if (list.get(i) == nums[j]) {
                count++;
            }
            if (count == 2) {
                j++;
                i = -1;
                count = 0;
            } else if (i == list.size() - 1 && count < 2) {
                n = m;
            }
        }
        System.out.println(n);
        System.out.println(singleNumber(nums));
    }


    public static int singleNumber(int[] nums) {
        int n = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        int count = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            int m = nums[j];
            if (list.get(i) == nums[j]) {
                count++;
            }
            if (count == 2) {
                j++;
                i = -1;
                count = 0;
            } else if (i == list.size() - 1 && count < 2) {
                n = m;
            }
        }
        return n;
    }
}
