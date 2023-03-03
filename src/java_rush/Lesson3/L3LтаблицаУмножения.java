package java_rush.Lesson3;
/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        1 2 3 4 ...
        2 4 6 8 ...
        3 6 9 12 ...
        4 8 12 16 ...
        ...*/
public class L3LтаблицаУмножения {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int res = j * i;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
