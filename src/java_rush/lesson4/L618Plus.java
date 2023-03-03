package java_rush.lesson4;
//Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L618Plus {
    public static void main(String[] args) throws Exception {
        //
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) {
            System.out.println("Подрасти еще");
        } else {
            System.out.println();
        }
    }
}
