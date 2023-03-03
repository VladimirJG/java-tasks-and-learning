package java_rush.lesson4;
/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
        Если числа равны между собой, необходимо вывести любое.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L6МаксимумЧетырехЧисел {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        int max1 = Math.max(num1, num2);
        int max2 = Math.max(num3, num4);
        int max = Math.max(max1,max2);
        System.out.println(max);

        //Решение JR int max1 = number1 > number2 ? number1 : number2;
        //        int max2 = number3 > number4 ? number3 : number4;
        //        int max = max1 > max2 ? max1 : max2;
        //        System.out.println(max);
    }
}
