package other_task_leet_code.easy;


/*
Учитывая две строки sи t, верните trueif sявляется подпоследовательностьюt , или falseв противном случае .

Подпоследовательность строки — это новая строка ,
которая формируется из исходной строки путем удаления некоторых (может быть ни одного)
символов без нарушения относительного положения остальных символов. (т. е. "ace"является
подпоследовательностью while is not)."abcde""aec"

Пример 1:

Ввод: s = «abc», t = «ahbgdc»
 Выход: true
Пример 2:

Ввод: s = «axc», t = «ahbgdc»
 Вывод: false

 */
public class Task392 {
    public static void main(String[] args) {
        String s = "aaa";
        String t = "bbaaaa";

        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}
