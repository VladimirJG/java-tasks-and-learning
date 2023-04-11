package JavaR2.in_out_put.Task9;
//Используя шаблон проектирования Wrapper (Decorator) расширь функциональность Task10AmigoOutputStream.
//В классе QuestionFileOutputStream при вызове метода close() должна быть реализована следующая функциональность:
//1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
//2. Считай строку.
//3. Если считанная строка равна "Д", то закрыть поток.
//4. Если считанная строка не равна "Д", то не закрывать поток.
//
//Требования:
//•	Интерфейс Task10AmigoOutputStream изменять нельзя.
//•	Класс QuestionFileOutputStream должен реализовывать интерфейс Task10AmigoOutputStream.
//•	Класс QuestionFileOutputStream должен инициализировать в конструкторе поле типа Task10AmigoOutputStream.
//•	Все методы QuestionFileOutputStream должны делегировать свое выполнение объекту Task10AmigoOutputStream.
//•	Метод close() должен спрашивать у пользователя "Вы действительно хотите закрыть поток? Д/Н".
//•	Метод close() должен закрывать поток только в случае, если считает с консоли ответ "Д".
import java.io.IOException;
public interface Task9 {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}
