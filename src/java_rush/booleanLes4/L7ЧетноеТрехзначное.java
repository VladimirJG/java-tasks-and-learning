package java_rush.booleanLes4;
//Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
//"четное однозначное число" - если число четное и имеет одну цифру,
//"нечетное однозначное число" - если число нечетное и имеет одну цифру,
//"четное двузначное число" - если число четное и имеет две цифры,
//"нечетное двузначное число" - если число нечетное и имеет две цифры,
//"четное трехзначное число" - если число четное и имеет три цифры,
//"нечетное трехзначное число" - если число нечетное и имеет три цифры.
//Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L7ЧетноеТрехзначное {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num >= 1 && num < 1000) {
            if (num % 2 == 0 && num / 100 > 0 && num / 100 < 10) {
                System.out.println("четное трехзначное число");
            } else if (num % 2 != 0 && num / 100 > 0 && num / 100 < 10) {
                System.out.println("нечетное трехзначное число");
            } else if (num % 2 == 0 && num / 10 > 0 && num / 10 < 100) {
                System.out.println("четное двузначное число");
            } else if (num % 2 != 0 && num / 10 > 0 && num / 10 < 100) {
                System.out.println("нечетное двузначное число");
            } else if (num % 2 == 0 && num < 10) {
                System.out.println("четное однозначное число");
            } else if (num % 2 != 0 && num < 10) {
                System.out.println("нечетное однозначное число");
            }
        } else {
            System.out.println();
        }
        //Решение JR
        // if (number > 0 && number < 10 && number % 2 == 0) {
        //            System.out.println("четное однозначное число");
        //        } else if (number > 0 && number < 10 && number % 2 != 0) {
        //            System.out.println("нечетное однозначное число");
        //        } else if (number > 9 && number < 100 && number % 2 == 0) {
        //            System.out.println("четное двузначное число");
        //        } else if (number > 9 && number < 100 && number % 2 != 0) {
        //            System.out.println("нечетное двузначное число");
        //        } else if (number > 99 && number < 1000 && number % 2 == 0) {
        //            System.out.println("четное трехзначное число");
        //        } else if (number > 99 && number < 1000 && number % 2 != 0) {
        //            System.out.println("нечетное трехзначное число");
        //        }
    }
}
