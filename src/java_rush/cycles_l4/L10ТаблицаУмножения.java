package java_rush.cycles_l4;
//Вывести на экран таблицу умножения 10х10 используя цикл while.
//Числа разделить пробелом.

public class L10ТаблицаУмножения {
    public static void main(String[] args) {

        int j = 1;
        while (j <= 10) {
            int i = 1;
            while (i <= 10) {
                System.out.print(j * i);
                System.out.print(" ");
                i++;
            }
            System.out.println();
            j++;
        }
    }
}

