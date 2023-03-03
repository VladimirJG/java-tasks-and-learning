package java_rush.Lesson3;
/*Вывести на экран следующий текст - две строки:
        It's a Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"

        Подсказка:
        \” – экранирование двойной кавычки;
        \\ – экранирование обратной косой черты (\).*/
public class L3L6Экранирование {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's a Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");

       /* Решение JR
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");*/
        System.out.println("日本語\n" +
                "\n");
    }
}
