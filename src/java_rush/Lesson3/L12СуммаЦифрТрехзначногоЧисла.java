package java_rush.Lesson3;


/*
Напиши код метода sumDigitsInNumber(int number).
        Метод на вход принимает целое трехзначное число.
        Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
*/
public class L12СуммаЦифрТрехзначногоЧисла {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;
        int var = number % 10;
        sum = sum + var;
        var = number / 10 % 10;
        sum = sum + var;
        var = number / 100;
        sum = sum + var;
        return sum;

        // Решение JR
       /* int sum = 0;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        return sum;*/
    }
}
