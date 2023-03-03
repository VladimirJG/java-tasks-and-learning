package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Ввести с клавиатуры 10 чисел и заполнить ими список.
//Вывести их в обратном порядке. Каждый элемент - с новой строки.
//Использовать только цикл for.
public class L12ВыводВОбратномПорядке {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
