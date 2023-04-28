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


        /**
         * Написать функцию, которая принимает фамилию, имя, отчество и возвращает
         * первые символы в формате "Ф.И.О.". Регистр вводных данных не определен
         */

        String firstName = "ivan";
        String lastName = "Kakaev";
        String patronymic = "urugvaevich";
        String result = firstWordOfFullName(firstName, lastName, patronymic);
        System.out.println(result);
    }

    public static String replaceStr(String string) {
        return string.replace(":(", ":)");
    }

    private static boolean startAndEndWord(String string, String word) {
        return string.startsWith(word) && string.endsWith(word);
    }

    public static String firstWordOfFullName(String firstName, String lastName, String patronymic) {
        char firstNameWord = Character.toUpperCase(firstName.charAt(0));
        char lastNameWord = Character.toUpperCase(lastName.charAt(0));
        char patronymicWord = Character.toUpperCase(patronymic.charAt(0));

        return String.format("%s.%s.%s.", lastNameWord, firstNameWord, patronymicWord);
    }
}
