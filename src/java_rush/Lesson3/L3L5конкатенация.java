package java_rush.Lesson3;

/*Реализуй метод public static void writeToConsole(String s), который добавляет к началу строки
        выражение "printing: " и выводит измененную строку на экран.*/
public class L3L5конкатенация {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);

    }
}
