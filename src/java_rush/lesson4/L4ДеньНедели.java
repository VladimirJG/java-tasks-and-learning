package java_rush.lesson4;
/*Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
        "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
        если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4ДеньНедели {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String num = bufferedReader.readLine();
        int number = Integer.parseInt(num);
        switch (number) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
        }// Решение JR default: sout
        if (number > 7 || number < 1) {
            System.out.println("такого дня недели не существует");
        }
    }
}
