package other_task_leet_code.algorithm;

import java.util.Arrays;

/**
 * Учитывая два отсортированных массива nums1и nums2 размер m и nсоответственно,
 * вернуть медиану двух отсортированных массивов.
 * <p>
 * Общая сложность времени выполнения должна быть O(log (m+n)).
 * <p>
 * <p>
 * <p>
 * Пример 1:
 * <p>
 * Ввод: nums1 = [1,3], nums2 = [2]
 * Вывод: 2,00000
 * Объяснение: объединенный массив = [1,2,3] и медиана равна 2.
 * Пример 2:
 * <p>
 * Ввод: nums1 = [1,2], nums2 = [3,4]
 * Вывод: 2,50000
 * Объяснение: объединенный массив = [1,2,3,4] и медиана (2 + 3) / 2 = 2,5.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4, 5};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        int firstIndex = arr.length / 2 - 1;
        int secondIndex = arr.length / 2;
        double median = 0;
        if (arr.length % 2 == 0) {
            median = (double) (arr[firstIndex] + arr[secondIndex]) / 2;
        } else {
            median = (double) arr[secondIndex];
        }
        return median;
    }
}
