package JavaR2.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Написать программу, которая будет вводить числа с клавиатуры.
//Код по чтению чисел с клавиатуры должен быть в методе readData.
//Код внутри readData обернуть в try..catch.
//Если пользователь ввёл какой-то текст, вместо ввода числа,
// то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
//Числа выводить с новой строки сохраняя порядок ввода.
public class TaskException9Password {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string;
            while (true) {
                string = reader.readLine();
                result.add(Integer.parseInt(string));
            }
        } catch (Exception e) {
            for (Integer value : result) {
                System.out.println(value);
            }
        }
    }
}
