package dmdev.oop.exception.task3;

/**
 * Создать собственный класс исключение - наследник класса Exception.
 * Создать метод выбрасывающий это исключение.
 * Вызвать метод и отловить исключение. Вывести Stacktrace в консоль
 */
public class MyClassException extends Exception{
    public MyClassException(RuntimeException message) {
        super(message);
    }
}
