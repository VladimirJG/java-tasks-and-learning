package java_rush.lesson4;
//Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L6AgeAnother {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20) {
            System.out.println(name + " И 18-ти достаточно");
        }
    }
}
