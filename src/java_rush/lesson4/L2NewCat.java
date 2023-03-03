package java_rush.lesson4;

/*Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.
        За количество котов отвечает переменная catsCount.*/
public class L2NewCat {
    private static int catsCount = 0;

    public static int addNewCat() {
        //напишите тут ваш код
        catsCount++;
        System.out.println(catsCount);
        return catsCount;
    }

    public static void main(String[] args) {
        L2NewCat l2NewCat = new L2NewCat();
        l2NewCat.addNewCat();
        addNewCat();
    }
}
