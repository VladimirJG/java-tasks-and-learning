package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//1. Введи с клавиатуры 10 слов в список строк.
//
//2. Метод doubleValues должен удваивать слова по принципу:
//"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"


public class L9Удвоение {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> replacement = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            replacement.add(list.get(i));
            replacement.add(list.get(i));
        }
        return replacement;
    }
}
