package java_rush.lesson4;
//Ввести с клавиатуры три числа, и вывести их в порядке убывания.
//Выведенные числа должны быть разделены пробелом.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L6СортировкаТрехЧисел {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        if (num3 > num2 && num2 > num1) {
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } else if (num3 > num2 && num2 < num1) {
            System.out.println(num3 + ", " + num1 + ", " + num2);
        } else if (num3 < num2 && num3 > num1) {
            System.out.println(num2 + ", " + num3 + ", " + num1);
        } else if (num3 < num2 && num2 > num1) {
            System.out.println(num2 + ", " + num1 + ", " + num3);
        } else {
            System.out.println(num1 + ", " + num2 + ", " + num3);
        }
    }
}
