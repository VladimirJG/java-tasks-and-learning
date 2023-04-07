package JavaR2;

import java.util.HashSet;
import java.util.Set;

//Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
public class TaskWordsByLetter {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> wordsByLetterЛ = new HashSet<>();
        wordsByLetterЛ.add("Ля");
        wordsByLetterЛ.add("Ле");
        wordsByLetterЛ.add("Лен");
        wordsByLetterЛ.add("Лим");
        wordsByLetterЛ.add("Лям");
        wordsByLetterЛ.add("Лом");
        wordsByLetterЛ.add("Лайм");
        wordsByLetterЛ.add("Лоно");
        wordsByLetterЛ.add("Лион");
        wordsByLetterЛ.add("Ля-фа");
        wordsByLetterЛ.add("Лафа");
        wordsByLetterЛ.add("Лайф");
        wordsByLetterЛ.add("Леон");
        wordsByLetterЛ.add("Лимон");
        wordsByLetterЛ.add("Лимфа");
        wordsByLetterЛ.add("Луг");
        wordsByLetterЛ.add("Любовь");
        wordsByLetterЛ.add("Лоскут");
        wordsByLetterЛ.add("Либидо");
        wordsByLetterЛ.add("Лабуда");
        return wordsByLetterЛ;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
