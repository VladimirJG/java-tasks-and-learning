package java_rush.lesson8_collections;
//1. Создай список чисел.
//2. Добавь в список 10 чисел с клавиатуры.
//3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
//
//Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
//3
//
//Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class L6СамаяДлиннаяПоследовательностьЧисел {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int count = 1;
        ArrayList<Integer> countList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                countList.add(count);
            } else {
                count = 1;
            }
        }
        System.out.println(Collections.max(countList));
    }
}

