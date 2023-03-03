package java_rush.lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

//Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
//Вывести на экран полученную сумму.
public class J12ВводПокаНеExit {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;

        while (true) {
            String input = buffer.readLine();
            if (!Objects.equals(input, "сумма")) {
               i+=Integer.parseInt(input);
            }else {
                System.out.println(i);
                break;
            }
        }
        //JR
        // int sum = 0;
        //        while (true) {
        //            String command = reader.readLine();
        //            if (command.equals("сумма")) {
        //                System.out.println(sum);
        //                return;
        //            }
        //            int number = Integer.parseInt(command);
        //            sum += number;
    }
}
