package java_rush.lesson5;

//Создать class Dog. У собаки должна быть кличка String name и возраст int age.
//Создай геттеры и сеттеры для всех переменных класса Dog.
public class Dog {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
