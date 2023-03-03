package java_rush.booleanLes4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
//"количество отрицательных чисел: а", "количество положительных чисел: б",
//где а, б - искомые значения.
//
//Пример:
//а) при вводе чисел
//2
//5
//6
//получим вывод
//количество отрицательных чисел: 0
//количество положительных чисел: 3
public class L7ПоложительныеИОтрицательные {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int countPlus = 0;
        int countMin = 0;
        if (num1 > 0) {
            countPlus++;
        } else if (num1 < 0) {
            countMin++;
        }
        if (num2 > 0) {
            countPlus++;
        } else if (num2 < 0) {
            countMin++;
        }
        if (num3 > 0) {
            countPlus++;
        } else if (num3 < 0) {
            countMin++;
        }
        System.out.println("количество положительных чисел: " + countPlus);
        System.out.println("количество отрицательных чисел: " + countMin);
    }
}
