package java_rush.lesson8_collections;

import java.util.HashSet;
import java.util.Set;

//Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
public class L8Set2 {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> list = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            list.add("L"+ i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
