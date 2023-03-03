package java_rush.Lesson3;
/*Ввести с клавиатуры число и имя, вывести на экран строку:
        "имя" захватит мир через "число" лет. Му-ха-ха!*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L7BReader2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String years = bufferedReader.readLine();
        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
