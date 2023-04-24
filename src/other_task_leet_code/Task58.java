package other_task_leet_code;
//Учитывая строку s, состоящую из слов и пробелов, вернуть длину последнего слова в строке.
//
//Слово – это максимальное
//подстрока
//состоящая только из не пробельных символов.

import java.util.Arrays;

//Example 1:
//
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.
//Example 2:
//
//Input: s = "   fly me   to   the moon  "
//Output: 4
//Explanation: The last word is "moon" with length 4.
//Example 3:
//
//Input: s = "luffy is still joyboy"
//Output: 6
//Explanation: The last word is "joyboy" with length 6.
public class Task58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        String[] m = s.split(" ");
        return m[m.length - 1].length();
    }
}
