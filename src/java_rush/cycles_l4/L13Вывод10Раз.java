package java_rush.cycles_l4;
//Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L13Вывод10Раз {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " ест кунжут");
        }
    }
}
