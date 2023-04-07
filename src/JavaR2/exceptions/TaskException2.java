package JavaR2.exceptions;

//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//String s = null;
//String m = s.toLowerCase();
public class TaskException2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
