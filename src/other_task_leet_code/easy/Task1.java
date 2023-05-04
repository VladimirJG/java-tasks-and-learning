package other_task_leet_code.easy;
//Учитывая массив целых чисел nums и целочисленную цель,
// вернуть индексы двух чисел так, чтобы они складывались в цель.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i] != nums[i1]) {
                    int res = nums[i] + nums[i1];
                    if (res == target) {
                        arr[0] = i;
                        arr[1] = i1;
                        Arrays.sort(arr);
                    }
                }
            }
        }
        return arr;
    }
}
