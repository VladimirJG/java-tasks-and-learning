package java_rush.lesson4;

/*Напиши метод checkInterval. Метод должен проверять попало ли целое число в интервал
        от 50 до 100 и сообщить результат на экран в следующем виде:
        "Число number не содержится в интервале." или "Число number содержится в интервале.",
        где number - аргумент метода.*/
public class L4Интервал {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        //напишите тут ваш код
        if (number >= 50 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале.");
        } else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }
    }
}
