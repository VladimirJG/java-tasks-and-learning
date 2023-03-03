package java_rush.lesson5;

//Создать класс прямоугольник (Rectangle).
// Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
//Создать для него как можно больше методов initialize(...)
//
//Примеры:
public class Rectangle {
    int top, left, width, height;

    public void initialize(int top) {
        this.top = top;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    //создаём копию другого прямоугольника (он и передаётся в параметрах)
    public void initialize(Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
}
