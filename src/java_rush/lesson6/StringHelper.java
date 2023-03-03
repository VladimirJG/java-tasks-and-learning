package java_rush.lesson6;
//Сделать класс StringHelper, у которого будут 2 статических метода:
//String multiply(String s, int count) - возвращает строку повторенную count раз.
//String multiply(String s) - возвращает строку повторенную 5 раз.
public class StringHelper {
    public static String multiply(String text) {

        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            System.out.println(text);
        }
        return "Успех";
    }

    public static String multiply(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(multiply("text"));
        System.out.println(StringHelper.multiply("Nya, poluchay", 5));
    }
}
