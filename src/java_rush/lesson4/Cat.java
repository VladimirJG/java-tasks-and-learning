package java_rush.lesson4;

/*	Метод setName класса Cat должен устанавливать значение переменной private String name
        равным переданному параметру String name.*/
public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }

}
