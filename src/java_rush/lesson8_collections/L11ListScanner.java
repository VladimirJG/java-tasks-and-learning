package java_rush.lesson8_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//1. Ввести с клавиатуры число N.
//2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//3. Найти минимальное число среди элементов списка - метод getMinimum.
//
//Требования:
//•	Программа должна выводить текст на экран.
//•	Программа должна считывать значения с клавиатуры.
//•	Класс Solution должен содержать только три метода.
//•	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов,
// заполненный числами с клавиатуры.
//•	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
//•	Метод main() должен вызывать метод getIntegerList().
//•	Метод main() должен вызывать метод getMinimum().
public class L11ListScanner {
    public static void main(String[] args) {
        List<Integer> list = getIntegerList();
       getMinimum(list);
    }

    public static List<Integer> getIntegerList() {
        Scanner scanner = new Scanner(System.in);
        int numberN = scanner.nextInt();

        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < numberN; i++) {
            listNumber.add(scanner.nextInt());
        }
        return listNumber;
    }

    public static void getMinimum(List<Integer> listNum) {
        System.out.println(Collections.min(listNum));
    }
}
