package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//1. Создай список строк в методе main.
//2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
public class L6ДобавлениеВНачало {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}
