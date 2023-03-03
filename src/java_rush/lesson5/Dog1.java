package java_rush.lesson5;

//Создать класс Dog (собака) с тремя инициализаторами:
//- Имя
//- Имя, рост
//- Имя, рост, цвет
public class Dog1 {
    String name;
    int height;
    String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
