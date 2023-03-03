package java_rush.lesson5;
//Вводить с клавиатуры числа и вычислить среднее арифметическое.
//Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//-1 не должно учитываться.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L5СреднееАрифметическое {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int j = 0;
        int i = 0;
        double sum = 0;
        while (i != -1) {
            i = Integer.parseInt(buffer.readLine());
            if (i != -1) {
                j++;
                sum += i;
            }
        }
        System.out.println(sum / j);
    }
}
//JR
/*
double sum = 0;
    int count = 0;
        while (true) {
                int number = Integer.parseInt(bufferedReader.readLine());

                if (number == -1) {
                System.out.println(sum / count);
                return;
                }
                count++;
                sum += number;
                }*/
