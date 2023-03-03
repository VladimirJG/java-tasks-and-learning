package java_rush.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры два целых числа, которые будут координатами точки,
// не лежащей на координатных осях OX и OY.
//Вывести на экран номер координатной четверти, в которой находится данная точка.
//Подсказка:
//Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
//для первой четверти a>0 и b>0;
//для второй четверти a<0 и b>0;
//для третьей четверти a<0 и b<0;
//для четвертой четверти a>0 и b<0.
//
//Пример для чисел 4 6:
//1
//
//Пример для чисел -6 -6:
//3
public class L6КоординатыТочкиНаОси {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 > 0 && num2 > 0) {
            System.out.println(1);
        } else if (num1 < 0 && num2 > 0) {
            System.out.println(2);
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(3);
        } else {
            // else if (a > 0 && b < 0) Решение JR
            System.out.println(4);
        }
    }
}
