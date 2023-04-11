package JavaR2.in_out_put;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести с консоли имя файла.
//Найти максимальный байт в файле, вывести его на экран.
//Закрыть поток ввода-вывода.
public class Task1 {
    public static void main(String[] args) throws Exception
    {
        //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».
        FileInputStream inputStream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\out");
        long sum = 0;

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            sum += data; //добавить его к общей сумме
        }
        inputStream.close(); // закрываем поток

        System.out.println(sum); //выводим сумму на экран.
    }
    }

