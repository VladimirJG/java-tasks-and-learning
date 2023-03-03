package java_rush.lesson2;

/*реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле,
        и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
        Тип возвращаемого значения - double.сила тяжести
        на Луне составляет примерно 17% от силы тяжести на Земле*/
public class L2L8ещеконвертер {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}
