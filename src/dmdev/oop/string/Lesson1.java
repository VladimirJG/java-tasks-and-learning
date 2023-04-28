package dmdev.oop.string;

/**
 * Заменить все грустные смайлы на веселые
 */
public class Lesson1 {
    public static void main(String[] args) {
        String string = "kfjvkn :( ldjnln :( ksbkbk:) hk bksbkbck:(";
        System.out.println(replaceStr(string));
/**
 * Написать функцию, принимающую два параметра: строку и слово
 * и возвращающую true если строка начинается и заканчивается этим словом
 */
        String string2 = "123 hdjvb do;m; 123";
        String word = "123";
        System.out.println(startAndEndWord(string2, word));
    }

    public static String replaceStr(String string) {
        return string.replace(":(", ":)");
    }

    private static boolean startAndEndWord(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }
}
