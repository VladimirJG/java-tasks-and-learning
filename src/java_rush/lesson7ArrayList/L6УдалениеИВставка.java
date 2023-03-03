package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
public class L6УдалениеИВставка {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String string = list.get(4);
            list.remove(4);
            list.add(0, string);
        }
        for (String st : list) {
            System.out.println(st);
        }
    }
}
