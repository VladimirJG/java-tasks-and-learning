package java_rush.cycles_l4;
//Ввести с клавиатуры строку и число N больше 0.
//Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L10ВывестиСтрокуNРаз {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int num = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i < num ){
            System.out.println(string);
            i++;
        }
        //JR
        //while (number > 0) {
        //            System.out.println(string);
        //            number--;
        //        }
    }
}
