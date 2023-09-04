package other;

import java.util.ArrayList;

public class TestJR {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        assert arrayOfStringList != null;
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(10);
        list.add("A");
        list.add("B");
        list.add("C");

        return new ArrayList[]{list};
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}
