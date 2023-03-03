package java_rush.lesson8_collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//Создать коллекцию Set (реализация HashSet) с типом элементов String.
//Добавить в неё следующие строки:
//арбуз
//банан
//вишня
//груша
//дыня
//ежевика
//женьшень
//земляника
//ирис
//картофель
//
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//Посмотреть, как изменился порядок добавленных элементов.
public class L3Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String text :
                set) {
            System.out.println(text);
        }
    }
}
