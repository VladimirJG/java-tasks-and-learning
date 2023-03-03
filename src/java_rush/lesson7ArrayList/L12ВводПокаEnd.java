package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Создать список строк.
//Ввести строки с клавиатуры и добавить их в список.
//Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
//Вывести строки на экран, каждую с новой строки.
public class L12ВводПокаEnd {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!list.contains("end")) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(list.get(i));
        }

    }
}


