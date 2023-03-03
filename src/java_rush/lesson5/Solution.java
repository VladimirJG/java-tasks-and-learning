package java_rush.lesson5;
//Создать три кота используя класс Cat.
//Провести три боя попарно между котами.
//Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
//Результат каждого боя вывести на экран c новой строки.
public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 1, 5, 3);
        Cat cat2 = new Cat("Gogy", 2, 3, 5);
        Cat cat3 = new Cat("Mursik", 4, 2, 7);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }
}
