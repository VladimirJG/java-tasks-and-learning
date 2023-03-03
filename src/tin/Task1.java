package tin;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt(); //прайс за месяц
        int size = scanner.nextInt();   // лимит мб за месяц
        int overprice = scanner.nextInt(); // цена за 1 мб при привышении лимита
        int planSize = scanner.nextInt();  // количество использованного траффика

        if (planSize <= size) {
            System.out.println(price);
        } else {
            System.out.println((planSize - size) * overprice + price);
        }
    }
}
