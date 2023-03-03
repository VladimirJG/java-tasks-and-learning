package java_rush.lesson4;
/*Напиши метод setCatsCount. Метод должен устанавливать количество котов (catsCount).*/

public class L2NewCat2 {
    private static int catsCount = 5;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        L2NewCat2.catsCount = catsCount;

    }

    public static void main(String[] args) {
        System.out.println(catsCount);
    }
}
