package other_task_leet_code.easy;

import java.util.HashMap;
import java.util.Map;

/*
Римские цифры представлены семью различными символами:  I, V, X, L, и .CDM

       Значение символа
я 1
В 5
х 10
л 50
С 100
Д 500
М 1000
Например,  2пишется как II римская цифра, просто складывая две единицы.
12пишется как  XII, что просто X + II. Число 27записывается как XXVII, то есть XX + V + II.

Римские цифры обычно пишутся от большей к меньшей слева направо.
Однако цифра «четыре» не является цифрой «четыре» IIII.
Вместо этого число четыре записывается как IV.
Поскольку единица стоит перед пятеркой,
мы вычитаем ее, получая четыре. Тот же принцип применим и к числу девять, которое записывается как IX.
Есть шесть случаев, когда используется вычитание:

Iможно поставить перед V(5) и X(10), чтобы получилось 4 и 9.
Xможно поставить перед L(50) и C(100), чтобы получилось 40 и 90.
Cможно поставить перед D(500) и M(1000), чтобы получить 400 и 900.
Дана римская цифра, преобразуйте ее в целое число.
 */
public class Task13_RomanToInt {
    public static void main(String[] args) {
        String s1 = "III";
        System.out.println(romanToInt(s1));

        String s2 = "LVIII";
        System.out.println(romanToInt(s2));

        String s3 = "MCMXCIV";
        System.out.println(romanToInt(s3));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int val = map.get(s.charAt(i));
            if (i < n - 1 && val < map.get(s.charAt(i+1))) {
                total -= val;
            } else {
                total += val;
            }
        }
        return total;
    }
}
