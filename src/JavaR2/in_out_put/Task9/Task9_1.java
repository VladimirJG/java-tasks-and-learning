package JavaR2.in_out_put.Task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Используя шаблон проектирования Wrapper (Decorator) расширь функциональность AmigoOutputStream/Task9.
//В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
//1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
//2. Считай строку.
//3. Если считанная строка равна "Д", то закрыть поток.
//4. Если считанная строка не равна "Д", то не закрывать поток.
//
//Требования:
//•	Интерфейс AmigoOutputStream изменять нельзя.
//•	Класс QuestionFileOutputStream/Task9_1 должен реализовывать интерфейс AmigoOutputStream/Task9.
//•	Класс QuestionFileOutputStream должен инициализировать в конструкторе поле типа AmigoOutputStream.
//•	Все методы QuestionFileOutputStream должны делегировать свое выполнение объекту AmigoOutputStream.
//•	Метод close() должен спрашивать у пользователя "Вы действительно хотите закрыть поток? Д/Н".
//•	Метод close() должен закрывать поток только в случае, если считает с консоли ответ "Д".
public class Task9_1 implements Task9 {
    private Task9 original;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Task9_1(Task9 task9) {
        this.original = task9;
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (reader.readLine().equals("Д")) original.close();
    }
}
