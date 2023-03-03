package java_rush.cycles_l4;
//Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
public class L13ПрямоугольныйТреугольник {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
