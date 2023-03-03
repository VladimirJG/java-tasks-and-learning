package java_rush.les5_constructors;
//Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.(4)

public class Circle2 {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle2(double x) {
    this.x = x;
    }

    public Circle2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2() {
    }

    public static void main(String[] args) {

    }
}
