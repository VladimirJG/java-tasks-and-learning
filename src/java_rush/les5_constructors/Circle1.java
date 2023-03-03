package java_rush.les5_constructors;
//Разберись, что делает программа.
//Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
//Подумай, какой конструктор нужно вызвать.
//Подсказка:
//внимательно изучи реализацию конструктора по умолчанию.
public class Circle1 {
    public double x;
    public double y;
    public double radius;

    public Circle1(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle1(double x, double y) {
        //напишите тут ваш код
        this(x,y,10);
    }

    public Circle1() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle1 anotherCircle = new Circle1(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
