package java_rush.lesson6;

//Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
//с помощью которых можно получить/изменить количество котов (переменную catCount).
public class Cat1 {
    private static int catCount = 0;

    public Cat1() {
        catCount++;
    }

    public static int getCatCount() {
        //напишите тут ваш код
        return catCount;
    }

    public static void setCatCount(int catCount) {
        //напишите тут ваш код
        Cat1.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
