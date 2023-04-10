package JavaR2.in_out_put;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

////Ввести с консоли имя файла.
////Найти максимальный байт в файле, вывести его на экран.
////Закрыть поток ввода-вывода.
public class Task2 {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\hyt");

        int num = 0;

        while (stream.available() > 0) {
            int newNum = stream.read();
            if (newNum > num) {
                num = newNum;
            }
        }
        stream.close();
        System.out.println(num);
    }
}
