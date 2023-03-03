package java_rush.lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1. Создать массив на 10 строк.
//2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент -
// с новой строки.
public class L4МассивИзСтрочекВОбратномПорядке {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length - 2; i++) {
            array[i] = reader.readLine();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
