package java_rush.lesson8_collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//Написать программу, которая вводит с клавиатуры строку текста.
//Программа заменяет в тексте первые буквы всех слов на заглавные.
//Вывести результат на экран.
//
//Пример ввода:
//мама мыла раму.
//
//Пример вывода:
//Мама Мыла Раму.
//
//Требования:
//•	Программа должна выводить текст на экран.
//•	Программа должна считывать строку с клавиатуры.
//•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
public class L11ЗаменаПервыхБукв {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String result = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            result += character;
        }
        System.out.println(result);
    }
}
