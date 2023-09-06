package other_task_leet_code.easy;

/*
Учитывая целочисленный массив numsи целое число val,
удалите все вхождения valin nums -place .
Порядок элементов может быть изменен.
Затем верните количество элементов, в numsкоторых не равныval .

Учитывайте количество элементов, в numsкоторых не равны val,
kчтобы их приняли, вам необходимо сделать следующее:

Измените массив numsтак, чтобы первые kэлементы numsсодержали элементы,
не равные val. Остальные элементы numsне важны, как и размер nums.
Возврат k.
Пример 1:

Ввод: nums = [3,2,2,3], val = 3
 Выход: 2, nums = [2,2,_,_]
 Объяснение: Ваша функция должна возвращать k = 2, причем первые два элемента nums должны быть 2.
Не имеет значения, что вы оставите после возвращенного k (следовательно, они являются подчеркиванием).
 */
public class Task27 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }

    public static int removeElement(int[] nums, int val) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[position] = nums[i];
                position++;
            }
        }
        return position;
    }
}
