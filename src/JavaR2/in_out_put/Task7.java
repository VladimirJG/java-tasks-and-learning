package JavaR2.in_out_put;
//Считать с консоли 2 имени файла: файл1, файл2.
//Записать в файл2 все байты из файл1, но в обратном порядке.
//Закрыть потоки.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\In");
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\ASUS\\Practice\\java-tasks-and-learning\\src\\out");
        List<String> list = new ArrayList<>();

        while (inputStream.available()>0){
            list.add(String.valueOf(inputStream.read()));
        }
        inputStream.close();
        Collections.reverse(list);
        for (String num :
                list) {
            outputStream.write(num.getBytes());
        }
        outputStream.close();
    }
}
