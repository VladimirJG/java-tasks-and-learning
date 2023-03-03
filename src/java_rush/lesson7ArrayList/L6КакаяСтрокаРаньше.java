package java_rush.lesson7ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
public class L6КакаяСтрокаРаньше {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minStringLength = list.get(0).length();
        int maxStringLength = list.get(0).length();
        for (String string : list){
            if (string.length() > maxStringLength){
                maxStringLength = string.length();
            }
            if (string.length()< minStringLength){
                minStringLength = string.length();
            }
        }
        for (String string : list){
            if(string.length() == maxStringLength){
                System.out.println(string);
                break;
            } else if (string.length() == minStringLength) {
                System.out.println(string);
                break;
            }
        }
    }
}
//JR
/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        String string = reader.readLine();
        strings.add(string);
        }

        String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
        if (strings.get(i).length() < minSizeElement.length()) {
        minSizeElement = strings.get(i);
        posMinElement = i;
        } else if (strings.get(i).length() > maxSizeElement.length()) {
        maxSizeElement = strings.get(i);
        posMaxElement = i;
        }
        }

        if (posMinElement < posMaxElement) {
        System.out.println(minSizeElement);
        } else {
        System.out.println(maxSizeElement);
        }*/
