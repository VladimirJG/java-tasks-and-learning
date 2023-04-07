package JavaR2.exceptions;

import java.util.ArrayList;

//Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
//ArrayList<String> list = new ArrayList<String>();
//String s = list.get(18);
public class TaskException4List {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
