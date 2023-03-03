package java_rush.cycles_l4;
//Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
//Каждое значение вывести с новой строки.

public class L13ЧетныеЧисла {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
//JR
            //for (int i = 2; i <= 100; i += 2) {
            //            System.out.println(i);
            //        }
        }
    }
}
