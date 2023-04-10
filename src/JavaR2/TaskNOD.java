package JavaR2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Давай найдем наибольший общий делитель (НОД). Для этого:
//Введи с клавиатуры 2 целых положительных числа.
//Выведи в консоли наибольший общий делитель.
public class TaskNOD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());

        if (firstNum <= 0 || secondNum <= 0) {
            System.err.println("The number must be greater than zero\n");
        }
        if (firstNum > secondNum) {
            System.out.println("Наибольший делитель = " + secondNum);
        }
        if (firstNum < secondNum) {
            System.out.println("Наибольший делитель = " + firstNum);
        }
    }
}
