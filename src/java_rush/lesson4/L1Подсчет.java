package java_rush.lesson4;
/*Подсчитать суммарную стоимость яблок.
        За суммарную стоимость яблок отвечает переменная public static int applesPrice.*/
public class L1Подсчет {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        Apple apple3 = new Apple();
        apple2.addPrice(150);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice += applesPrice ;

        }
    }
}

