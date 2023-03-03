package java_rush.Lesson3;
/*Ввести с клавиатуры отдельно Имя, число1, число2.
        Вывести надпись:
        "Имя" получает "число1" через "число2" лет.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L7BReader3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String money = bufferedReader.readLine();
        String years = bufferedReader.readLine();
        System.out.println(name+" получает " + money + " рублей в месяц через " + years + " лет.");
    }
}
