package JavaR2.exceptions;

//Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
//Обернуть вызов sleep в try..catch.
public class TaskException8 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);

            //напишите тут ваш код
        }
    }
}
