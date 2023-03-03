package java_rush.Lesson3;
/*Реализуй метод public static void div(int a, int b).
        Метод должен делить первое число на второе, и выводить на экран результат деления а на b.
        На экран должно быть выведено целое число.*/
public class L3L1Divided {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) {
        int c = a / b;
        System.out.println(c);
        //Рушуние JR System.out.println(a / b)

    }
}
