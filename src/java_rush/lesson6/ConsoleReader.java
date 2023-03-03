package java_rush.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Сделать класс ConsoleReader, у которого будут 4 статических метода:
//String readString() - читает с клавиатуры строку
//int readInt() - читает с клавиатуры число
//double readDouble() - читает с клавиатуры дробное число
//boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
//
//Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readText = reader.readLine();
        return readText;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readNumber = Integer.parseInt(reader.readLine());
        return readNumber;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double readDoubleNumber = Double.parseDouble(reader.readLine());
        return readDoubleNumber;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean readBoolean = Boolean.parseBoolean(reader.readLine());
        return readBoolean;
    }

    public static void main(String[] args) throws Exception {

    }
}
