package dmdev.oop.string;

/**
 * Заменить все грустные смайлы на веселые
 */
public class Lesson1 {
    public static void main(String[] args) {
        String string = "kfjvkn :( ldjnln :( ksbkbk:) hk bksbkbck:(";
        System.out.println(replaceStr(string));
    }

    public static String replaceStr(String string) {
        return string.replace(":(", ":)");
    }
}
