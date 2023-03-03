package java_rush.les5_constructors;

//Создать класс (Circle) круг, с тремя конструкторами:
//- centerX, centerY, radius
//- centerX, centerY, radius, width
//- centerX, centerY, radius, width, color
public class Circle0 {
    int centerX, centerY, radius, width, color;

    public Circle0(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle0(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle0(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
