package java_rush.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
// Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//Потом программа строит новый список. Если в строке чётное число букв, строка удваивается,
// если нечётное - утраивается.
//Программа выводит содержимое нового списка на экран.
public class L12УтраиваниеСтрок {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            list.add(string);
            if (string.isEmpty()) {
                break;
            }
        }
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() % 2 == 0) {
                newList.add(list.get(i));
                newList.add(list.get(i));
            } else {
                newList.add(list.get(i));
                newList.add(list.get(i));
                newList.add(list.get(i));
            }
            System.out.println(list.get(i).toUpperCase());
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
