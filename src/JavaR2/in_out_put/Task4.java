package JavaR2.in_out_put;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Ввести с консоли имя файла.
//Найти байт или байты с максимальным количеством повторов.
//Вывести их на экран через пробел.
//Закрыть поток ввода-вывода.
public class Task4 {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\out");
        List<Integer> listOfStream = new ArrayList<>();
        while (stream.available() > 0) {
            listOfStream.add(stream.read());
        }
        stream.close();
        int count = 0;
        List<Integer> repeatingElements = new ArrayList<>();
        for (int i = 0; i < listOfStream.size(); i++) {
            int num = listOfStream.get(i);
            for (int i1 = 0; i1 < listOfStream.size(); i1++) {
                int num2 = listOfStream.get(i1);
                if (num == num2) {
                    count++;
                }
            }
            if (count > 1) {
                repeatingElements.add(num);
            }
            count = 0;
        }
        System.out.println(listOfStream);
        System.out.println(repeatingElements.stream().distinct().toList());
        System.out.println(listOfStream.stream().distinct().sorted().toList());
    }
}
