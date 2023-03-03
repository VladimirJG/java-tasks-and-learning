package java_rush.lesson5;
//Создать class Person. У человека должно быть имя String name,
// возраст int age, адрес String address, пол char sex.

public class Person {
    String name;
    int age;
    String address;
    char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
