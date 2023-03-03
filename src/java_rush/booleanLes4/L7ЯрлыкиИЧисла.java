package java_rush.booleanLes4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
//"отрицательное четное число" - если число отрицательное и четное,
//"отрицательное нечетное число" - если число отрицательное и нечетное,
//"ноль" - если число равно 0,
//"положительное четное число" - если число положительное и четное,
//"положительное нечетное число" - если число положительное и нечетное.
public class L7ЯрлыкиИЧисла {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num < 0 && num % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (num < 0 ) {
            System.out.println("отрицательное нечетное число");
        } else if (num > 0 && num % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (num > 0 ) {
            System.out.println("положительное нечетное число");
        }else {
            System.out.println("ноль");
        }
    }
}
