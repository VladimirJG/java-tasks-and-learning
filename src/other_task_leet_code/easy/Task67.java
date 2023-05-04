package other_task_leet_code.easy;


//Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки.
//Пример 1:
//
//Ввод: a = "11", b = "1"
// Выход: "100"
//Пример 2:
//
//Ввод: а = "1010", б = "1011"
// Выход: "10101"
public class Task67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        addBinary(a, b);

    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String c = a;
            a = "";
            for (int i = 0; i < b.length() - c.length(); i++) {
                a += "0";
            }
            a += c;
        } else if (b.length() < a.length()) {
            String c = b;
            b = "";
            for (int i = 0; i < a.length() - c.length(); i++) {
                b += "0";
            }
            b += c;
        }
        String end = "";
        int count = 0;
        for (int i = Math.max(a.length(), b.length()) - 1; i >= 0; i--) {
            int m = Integer.parseInt(String.valueOf(a.charAt(i))) + Integer.parseInt(String.valueOf(b.charAt(i)));
            if (m == 2) {
                if (count > 0) {
                    end += "1";
                } else {
                    end += "0";
                    count++;
                }
            } else if (m == 1) {
                if (count > 0) {
                    end += "0";
                } else {
                    end += "1";
                }
            } else {
                if (count > 0) {
                    end += "1";
                    count--;
                } else {
                    end += "0";
                }
            }
            if (i == 0 && count > 0) {
                end += "1";
            }
        }
        String reverse = new StringBuffer(end).reverse().toString();
        System.out.println(reverse);
        return new StringBuffer(end).reverse().toString();
    }
}