package java_rush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Создай список слов, заполни его самостоятельно.
//2. Метод fix должен:
//2.1. удалять из списка строк все слова, содержащие букву "р"
//2.2. удваивать все слова содержащие букву "л".
//2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//2.4. с другими словами ничего не делать.
public class TaskDoubleDelete {
    public static void main(String[] args) {
        String[] arr = {"рыло", "радость", "быдло", "грусть", "трактор", "лес", "лор"};
        List<String> list = new ArrayList<>();

        for (String i : arr) {
            if (i.contains("р") && i.contains("л")) {
                list.add(i);
            } else if (i.contains("л")) {
                list.add(i);
                list.add(i);
            } else {
                if (!i.contains("р")) {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }
}
