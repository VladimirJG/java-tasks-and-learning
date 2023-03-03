package java_rush.Lesson3;

/*Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
        Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
        Эти размеры передаются в метод getVolume. Метод должен вернуть количество литров воды,
        которое нужно для наполнения бассейна.*/
public class L3L5 {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        return  a * b * c * 1000L;
    }
}
