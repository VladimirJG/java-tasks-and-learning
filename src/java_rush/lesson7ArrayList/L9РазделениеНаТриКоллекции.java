package java_rush.lesson7ArrayList;
//1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//Порядок объявления списков очень важен.
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//3. Используя метод printList выведи эти три списка на экран.
// Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class L9РазделениеНаТриКоллекции {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> listDividedBy3 = new ArrayList<>();
        ArrayList<Integer> listDividedBy2 = new ArrayList<>();
        ArrayList<Integer> listAnother = new ArrayList<>();
        ArrayList<Integer> listInput = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            listInput.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer num : listInput) {
            if (num % 3 == 0 && num % 2 == 0){
                listDividedBy3.add(num);
                listDividedBy2.add(num);
            }else if(num % 3 == 0){
                listDividedBy3.add(num);
            } else if (num % 2 == 0) {
                listDividedBy2.add(num);
            }else {
                listAnother.add(num);
            }
        }
        printList(listDividedBy3);
        System.out.println("=======================");
        printList(listDividedBy2);
        System.out.println("=======================");
        printList(listAnother);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
