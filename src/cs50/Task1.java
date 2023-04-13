package cs50;

import java.util.Scanner;

//Логично: чем дольше вы принимаете душ, тем больше воды уходит на этот процесс.
// Давайте прикинем, сколько? Даже если ваш душ едва открыт, в минуту из него вытекает примерно 6 литров воды.
// А это 12 бутылочек воды, которые вы носите с собой для питья.
// Обычно человек принимает душ минут 10. Итого, чтобы помыться, нужно 120 полулитровых бутылок. Немало!
// Программа должна подсчитывать сколько бутылочек воды уходит на душ зависимости от времени. То есть:
//
//Программа запрашивает у пользователя количество минут, проведенных в душе.
//Пользователь вводит положительное целое число.
//Программа выводит на экран количество бутылочек, израсходованных пользователе
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("17");
        double literInMinute = 6.0;
        double bottle = 2;
        System.out.println("Enter the number of minutes in the shower: ");
        double minute = scanner.nextInt();
        double numOfBottles = 0;
        if (minute > 0) {
            numOfBottles = (minute * literInMinute) / bottle;
            System.out.println((int) numOfBottles +" bottles needed for a shower");
        } else {
            System.out.println("Enter the positive number");
        }
    }
}
