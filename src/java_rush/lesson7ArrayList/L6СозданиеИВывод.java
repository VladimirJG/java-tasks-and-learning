package java_rush.lesson7ArrayList;

import java.util.ArrayList;

//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
public class L6СозданиеИВывод {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,"string1");
        list.add(1,"string2");
        list.add(2,"string3");
        list.add(3,"string4");
        list.add(4,"string5");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    //JR
   /* ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        for (String string : list) {
        System.out.println(string);
    }*/
}
