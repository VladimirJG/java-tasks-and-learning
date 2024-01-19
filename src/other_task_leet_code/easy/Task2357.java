package other_task_leet_code.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
2357 . Сделать массив нулевым, вычитая равные суммы
Легкий
1К
41
Компании
Вам дан массив неотрицательных целых чисел nums. За одну операцию необходимо:

Выберите целое положительное число x, которое xменьше или равно наименьшему ненулевому элементу в nums.
Вычтите xиз каждого положительного элемента в nums.
Возвращает минимальное количество операций, чтобы сделать каждый элемент numsравным0 .



Пример 1:

Ввод: nums = [1,5,0,3,5]
 Вывод: 3
 Объяснение:
В первой операции выберите x = 1. Теперь nums = [0,4,0,2,4].
Во второй операции выберите x = 2. Теперь nums = [0,2,0,0,2].
В третьей операции выберите x = 2. Теперь nums = [0,0,0,0,0].
Пример 2:

Ввод: nums = [0]
 Вывод: 0
 Объяснение: Каждый элемент в nums уже равен 0, поэтому никаких операций не требуется.


Ограничения:

1 <= nums.length <= 100
0 <= nums[i] <= 100
 */
public class Task2357 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 5, 0, 3, 5};
        System.out.println(minimumOperations(nums));
    }

    static int count = 1;

    public static int minimumOperations(int[] nums) {
        if (count == 1 && Arrays.stream(nums).sum() == 0) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();


        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }
        int integer = (int) (Math.random() * 100);
        for (Integer integer1 : list) {
            if (integer1 < integer) {
                integer = integer1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = nums[i] - integer;
            }
        }
        if (Arrays.stream(nums).sum() > 0) {
            count++;
            minimumOperations(nums);
        }
        return count;
    }


}
