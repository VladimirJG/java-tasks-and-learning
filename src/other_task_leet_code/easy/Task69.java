package other_task_leet_code.easy;

public class Task69 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(12));
        System.out.println(Math.sqrt(1));
        System.out.println(ret(1));
    }

    public static int ret(int x) {
        if (x <= 1)
            return x;
        int left = 0;
        int right = x;
        int tNum = x;
        while (true) {
            int mid = (right + left) / 2;
            long msq = (long) mid * mid;
            if (mid == tNum || msq == x) {
                return mid;
            }
            if (msq < x) {
                left = mid;
            } else {
                right = mid;
            }
            tNum = mid;
        }
    }
}
