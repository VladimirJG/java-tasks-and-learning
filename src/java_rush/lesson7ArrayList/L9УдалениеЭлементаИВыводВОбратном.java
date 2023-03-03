package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Введи с клавиатуры 5 слов в список строк.
// Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
public class L9УдалениеЭлементаИВыводВОбратном {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
            //JR
            /*for (int i = list.size() - 1; i >= 0; i--) {
                String string = list.get(i);
                System.out.println(string);*/
        }
    }
}
