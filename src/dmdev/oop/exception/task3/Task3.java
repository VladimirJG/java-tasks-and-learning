package dmdev.oop.exception.task3;
/**
 * Создать собственный класс исключение - наследник класса Exception.
 * Создать метод выбрасывающий это исключение.
 * Вызвать метод и отловить исключение. Вывести Stacktrace в консоль
 */
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (MyClassException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            throw new RuntimeException(e);
        }
    }
    public static void unsafe() throws MyClassException {// Если был бы RunTimeException пробрасывать его не надо
        throw new MyClassException(new RuntimeException("Исключение"));
    }
}
