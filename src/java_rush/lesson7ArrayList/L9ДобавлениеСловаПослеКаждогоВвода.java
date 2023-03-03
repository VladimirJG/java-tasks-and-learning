package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.
public class L9ДобавлениеСловаПослеКаждогоВвода {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size(); i++) {
            String string = "именно";
            if (list.get(i) != string)
            list.add(i + 1, string);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
