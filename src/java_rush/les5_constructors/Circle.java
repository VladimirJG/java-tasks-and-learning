package java_rush.les5_constructors;
//Разберись, что делает программа.
//Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.
//
//Подсказка:
//изучи конструктор по умолчанию.
//Программа должна вывести слово "Red" на экран.

public class Circle {
    //было public Color color;
    public Color color = new Color();
// JR public Circle() {
//        color = new Color();
//    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public void Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
