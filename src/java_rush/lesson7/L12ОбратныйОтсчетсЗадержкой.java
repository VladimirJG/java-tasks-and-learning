package java_rush.lesson7;
//Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
//Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку,
// воспользуйся функцией:
//Thread.sleep(100); //задержка на одну десятую секунды.
public class L12ОбратныйОтсчетсЗадержкой {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println(i);

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
    //JR
    // public static void main(String[] args) {
    //        for (int i = 30; i >= 0; i--) {
    //            System.out.println(i);
    //            try {
    //                Thread.sleep(100);
    //            } catch (InterruptedException ignore) {
    //            }
    //        }
    //        System.out.println("Бум!");
    //    }
}
