package dmdev.oop.string;

import java.util.Arrays;

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

        /**
         * Подсчитать количество всех точек, запятых, восклицательных знаков в строке
         */

        String string3 = "kfvk.,!?kd;cm..,dlhck,cjkdk?%";
        System.out.println(countSymbol(string3));

        /**
         * Написать функцию, которая принимает строку и int n и разбивает ее на n символов и помещает их в массив строк
         * отдельными частями. Вывести массив
         */

        String string4 = "12367890";
        int n = 3;
        String[] arr = splitArr(string4, n);
        System.out.println(Arrays.toString(arr));
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

    public static int countSymbol(String string3) {
        String result = string3.replace(",", "")
                .replace(".", "")
                .replace("!", "");
        return string3.length() - result.length();
    }

    public static String[] splitArr(String string4, int n) {
        int arrSize = (int) (Math.ceil(string4.length() / (double) n));
        String[] array = new String[arrSize];
        int increment = 0;
        for (int i = 0; i < string4.length(); i += n) {
            int endIndex = Math.min(string4.length(), i + n);
            array[increment] = string4.substring(i, endIndex);
            increment++;
        }
        return array;
    }
}
