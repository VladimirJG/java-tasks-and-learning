package cs50;

public class Replacement {
    public static void main(String[] args) {
        int x = 17;
        int y = 6;
         swap(x,y);

    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}