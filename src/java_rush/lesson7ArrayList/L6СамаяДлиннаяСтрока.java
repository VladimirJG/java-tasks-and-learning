package java_rush.lesson7ArrayList;
//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class L6СамаяДлиннаяСтрока {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        ArrayList<String> newString = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        newString.add(0, strings.get(0));

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > newString.get(0).length()) {
                newString.set(0, strings.get(i));
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == newString.get(0).length()) {
                newString.add(strings.get(i));
            }
        }
        newString.remove(0);
        for (int i = 0; i < newString.size(); i++) {
            System.out.println(newString.get(i));
        }
        System.out.println(newString.size());
    }
}
//JR
/*
strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
        strings.add(reader.readLine());
        }

        int maxStringLength = strings.get(0).length();
        for (String string : strings) {
        if (string.length() > maxStringLength) {
        maxStringLength = string.length();
        }
        }

        for (String string : strings) {
        if (string.length() == maxStringLength) {
        System.out.println(string);
        }
        }
        }
*/

