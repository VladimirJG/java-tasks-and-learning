package java_rush.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.valueOf;

//Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр,
// а сколько нечетных.
//Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
//Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
//Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
//
//Пример для числа 4445:
//Even: 3 Odd: 1
public class L5СчетчикЧетныхИНечетных {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        for (int i = 0; i < num.length(); i++) {
            int j = num.charAt(i);//разделение инта посимвольно!!!!!!!!!!!!!!!!
            if (j%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: " +  even +  " Odd: " + odd);
    }
}
