package java_rush.lesson4;
/*Ввести с клавиатуры число.
        Если число положительное, то увеличить его в два раза.
        Если число отрицательное, то прибавить единицу.
        Если введенное число равно нулю, необходимо вывести ноль.
        Вывести результат на экран.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L4Положительноеиотрицательноечисло {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String num = bufferedReader.readLine();
        int number = Integer.parseInt(num);
        if (number % 2 == 0) {
            number += number;
            System.out.println(number);
        } else if (number == 0) {
            System.out.println(0);

        } else {
            number += 1;
            System.out.println(number);
        }
        //загнался про положительность и отрицательность
        // надо просто > или < 0(((
    }
}

