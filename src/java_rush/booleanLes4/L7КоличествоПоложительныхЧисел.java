package java_rush.booleanLes4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
public class L7КоличествоПоложительныхЧисел {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if (num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println(3);
        } else if ((num1 > 0 && num2 > 0 && num3 < 0) || (num1 > 0 && num3 > 0 && num2 < 0) || (num1 < 0 && num2 > 0 && num3 > 0)) {
            System.out.println(2);
        } else if ((num1 > 0 && num2 < 0 && num3 < 0) || (num1 < 0 && num3 < 0 && num2 > 0) || (num1 < 0 && num2 < 0 && num3 > 0)) {
            System.out.println(1);
        }
    }//JR
    //int counter = 0;
    //        if (number1 > 0) {
    //            counter++;
    //        }
    //        if (number2 > 0) {
    //            counter++;
    //        }
    //        if (number3 > 0) {
    //            counter++;
    //        }
    //        System.out.println(counter);
}
