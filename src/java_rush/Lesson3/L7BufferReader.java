package java_rush.Lesson3;

import java.io.*;

public class L7BufferReader {
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    String name = bufferedReader.readLine();//читаем строку с клавиатуры
    String sAge = bufferedReader.readLine();//читаем строку с клавиатуры
    int nAge = Integer.parseInt(sAge);//преобразовываем строку в число.

    public L7BufferReader() throws IOException {
    }
// Более компкатная запись
    /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    String sAge = reader.readLine();
    int nAge = Integer.parseInt(sAge);*/
}
