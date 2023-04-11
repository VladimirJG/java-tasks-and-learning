package JavaR2.in_out_put;

import java.io.FileInputStream;
import java.io.IOException;

//С консоли считать имя файла.
//Посчитать в файле количество символов ',', количество вывести на консоль.
//Закрыть потоки.
//
//Подсказка:
//нужно сравнивать с ascii-кодом символа ','.
public class Task6 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\In");
        int count = 0;
        char b = 44;
        while (inputStream.available() > 0) {
            if (inputStream.read() == b) {
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
