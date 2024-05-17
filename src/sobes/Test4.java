package sobes;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8};
        int num = 5;
        System.out.println(returnIndex(arr, num));
    }

    public static Integer returnIndex(int[] arr, int num) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        while (lowIndex < highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;

            if (arr[middleIndex] == num) {
                return middleIndex;
            }
            if (arr[middleIndex] > num) {
                highIndex = middleIndex - 1;
            }
            if (arr[middleIndex] < num) {
                lowIndex = middleIndex + 1;
            }
        }
        return arr[lowIndex] >= num ? lowIndex : lowIndex + 1;
    }
}
