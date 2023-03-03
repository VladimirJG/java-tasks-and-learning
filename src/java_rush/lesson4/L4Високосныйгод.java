package java_rush.lesson4;
/*Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
        количество дней в году: x
        , где
        х - 366 для високосного года,
        х - 365 для обычного года.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4Високосныйгод {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());
        if (year % 400 == 0 && year % 4 == 0) {
            System.out.println("количество дней в году: " + 366);
        }else {
            System.out.println("количество дней в году: " + 365);
        }
//Решение JR:
        int days;

        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else {
            days = 365;
        }

        System.out.println("количество дней в году: " + days);
    }
}
