package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Ввести с клавиатуры 2 числа N и M.
//Ввести N строк и заполнить ими список.
//Переставить M первых строк в конец списка.
//Вывести список на экран, каждое значение с новой строки.
//
//Примечание: запрещено создавать больше одного списка.
public class L12ПерестановкаRemove0 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int quantityN = Integer.parseInt(reader.readLine());
        int quantityM = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < quantityN; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < quantityM; i++) {
            list.add(list.get(0));
            list.remove(list.get(0));

        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
