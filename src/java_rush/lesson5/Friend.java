package java_rush.lesson5;

//Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
//- Имя
//- Имя, возраст
//- Имя, возраст, пол
//
//Примечание:
//Имя(String), возраст(int), пол(char).
public class Friend {
    private String friendName;
    private int friendAge;
    private char friendSex;

    public void initialize(String name) {
        this.friendName = name;
    }
    public void initialize(String name, int age) {
        this.friendName = name;
        this.friendAge = age;
    }
    public void initialize(String name, int age, char sex) {
        this.friendName = name;
        this.friendAge = age;
        this.friendSex = sex;
    }

}
