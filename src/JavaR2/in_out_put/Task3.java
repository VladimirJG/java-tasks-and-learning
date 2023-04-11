package JavaR2.in_out_put;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Ввести с консоли имя файла.
//Найти минимальный байт в файле, вывести его на экран.
//Закрыть поток ввода-вывода.
public class Task3 {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\out");

        int min = 120;
        while(stream.available()>0){
            int numByte = stream.read();
            if (numByte<min){
                min=numByte;
            }
        }
        stream.close();
        System.out.println(min);
    }
}
