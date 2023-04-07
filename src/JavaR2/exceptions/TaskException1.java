package JavaR2.exceptions;

//Перехватить исключение, возникающее при выполнении кода:
//int a = 42 / 0;
//Вывести на экран тип перехваченного исключения.
public class TaskException1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        } catch (Exception e) {
            System.err.println(e + " !!! Не делят на ноль");
        }

        //напишите тут ваш код
    }
}
