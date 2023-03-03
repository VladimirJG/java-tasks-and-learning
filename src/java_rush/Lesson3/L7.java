package java_rush.Lesson3;

//Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.
public class L7 {
    public static void main(String[] args) {
        int secondsAfter15 = 0;
        double hoursAfter15 = 0.5;
        int min = 60;
        int sec = 60;
        secondsAfter15 = (int) (hoursAfter15 * min * sec);
     /* Решение JR//  int secondsAfter15 = 30 * 60;*/
        System.out.println(secondsAfter15);

    }
}
