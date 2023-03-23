package other_task;
//Получив 32-битное целое число со знаком x, верните его цифры в обратном порядке.
// Если реверсирование приводит к тому, что значение выходит за пределы диапазона
// 32-разрядных целых чисел со знаком , то возвращается значение .[-231, 231 - 1]0

//Предположим, что среда не позволяет хранить 64-битные целые числа (со знаком или без знака).
//Пример 1:
//Вход: х = 123
// Выход: 321

//Пример 2:
//Вход: х = -123
// Выход: -321

//Пример 3:
//Вход: х = 120
// Выход: 21
//Ограничения:
//-231 <= x <= 231 - 1
public class Task7 {
    public static void main(String[] args) {
        int x = 109000;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        String str = String.valueOf(x);
        StringBuilder reverse = new StringBuilder(str).reverse();
        String newX = "";
        if (x < 0) {
            newX = "-";
        }
        if (x==0){
            return 0;
        }
        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i)!='0'&& reverse.charAt(i)!='-' ){
                newX+=String.valueOf(reverse.charAt(i));
            }
        }
        return Integer.parseInt(newX);
    }
}
