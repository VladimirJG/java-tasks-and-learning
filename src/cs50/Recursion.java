package cs50;

public class Recursion {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(recur2(num));
    }

    public static void recur(int num) {
        if (num == 0) {
            System.out.print("End");
        } else {
            System.out.println(num - 1);
            recur(num - 1);
        }
    }

    public static int recur2(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recur2(num - 1);
        }
    }
}
