package java_rush.lesson4;

/*
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
        Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L6МинимумДвухЧисел {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        if (number1 > number2) {
            System.out.println(number2);
        } else if (number2 > number1) {
            System.out.println(number1);
        } else {
            System.out.println(number1 | number2);
        }
        //Решение JR int min = number1 < number2 ? number1 : number2;
        //        System.out.println(min);
    }
}
