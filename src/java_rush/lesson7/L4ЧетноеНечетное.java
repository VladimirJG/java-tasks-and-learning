package java_rush.lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//1. Создать массив на 15 целых чисел.
//2. Ввести в него значения с клавиатуры.
//3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
//Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить,
// на какой стороне улицы проживает больше жителей.
//4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей."
// или "В домах с четными номерами проживает больше жителей."
//
//Примечание:
//дом с порядковым номером 0 считать четным.
public class L4ЧетноеНечетное {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbersOfHouse = new int[15];
        int evenNumberOfHouse = 0;
        int oddNumberOfHouse = 0;
        for (int i = 0; i < numbersOfHouse.length; i++) {
            int numberOfPeople = Integer.parseInt(reader.readLine());
            numbersOfHouse[i] = numberOfPeople;
            if (numberOfPeople != 0) {
                if (numbersOfHouse[i] % 2 == 0) {
                    evenNumberOfHouse++;
                } else {
                    oddNumberOfHouse++;
                }
            } else {
                System.out.println("ничего");
            }
        }
        if (oddNumberOfHouse > evenNumberOfHouse) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
