package java_rush.Lesson3;

public class L3L4Произведение10чисел {
    public static void main(String[] args) {
        int res = 1;
        for (int i = 2; i <= 10; i++)
            res *= i;
        System.out.println(res);

       /* Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):*/
        int res1 = 0;
        for (int i = 1; i <= 5; i++) {
            res1 += i;
            System.out.println(res1);
        }
    }
}
