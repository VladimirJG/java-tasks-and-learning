package java_rush.cycles_l4;
//Вводить с клавиатуры числа.
//Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//-1 должно учитываться в сумме.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L16ВводДоВылета {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int j = 0;
        while (i != -1) {
            i = Integer.parseInt(buffer.readLine());
            j += i;
        }
        System.out.println(j);

        //JR
        //int sum = 0;
        //        while (true) {
        //            int number = Integer.parseInt(reader.readLine());
        //            sum += number;
        //
        //            if (number == -1) {
        //                break;
        //            }
        //        }
        //        System.out.println(sum);
    }
}
