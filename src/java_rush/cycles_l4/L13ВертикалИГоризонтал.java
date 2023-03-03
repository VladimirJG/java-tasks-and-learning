package java_rush.cycles_l4;
//Используя цикл for вывести на экран:
//- горизонтальную линию из 10 восьмёрок
//- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
public class L13ВертикалИГоризонтал {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(8);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(8);
        }
    }
}
