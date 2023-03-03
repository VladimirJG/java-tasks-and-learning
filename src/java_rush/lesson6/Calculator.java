package java_rush.lesson6;

//Сделать класс Calculator, у которого будут 5 статических методов:
//int plus(int a, int b) - возвращает сумму чисел a и b
//int minus(int a, int b) - возвращает результат вычитания из числа a числа b
//int multiply(int a, int b) - возвращает результат умножения числа a на число b
//double division(int a, int b) - возвращает результат деления числа a на число b
//double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50)
// должен вернуть 50% от 4)
public class Calculator {
    public static int plus(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int res = a - b;
        return res;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return 0;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (a * 1.0) / b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (a * b * 1.0) / 100;
    }

    public static void main(String[] args) {
        System.out.println(plus(4, 5));
        System.out.println(minus(4, 5));
        System.out.println(percent(4,50));
    }
}
