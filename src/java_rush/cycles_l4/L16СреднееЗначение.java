package java_rush.cycles_l4;
//Ввести с клавиатуры три числа, вывести на экран среднее из них.
//Т.е. не самое большое и не самое маленькое.
//Если все числа равны, вывести любое из них.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L16СреднееЗначение {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(buffer.readLine());
        int num2 = Integer.parseInt(buffer.readLine());
        int num3 = Integer.parseInt(buffer.readLine());
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.println(num1);
        } else if ((num2 > num1 && num2 < num3) || (num1 > num2 && num2 > num3)) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
