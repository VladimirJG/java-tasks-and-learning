package sobes.aston;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LittleUsers {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Masha", "Feo", 25));
        users.add(new User("Masha", "fo", 18));
        users.add(new User("Stas", "K", 32));
        users.add(new User("Stas", "B", 28));
        users.add(new User("Stas", "V", 24));
        users.add(new User("Tanya", "U", 15));
        users.add(new User("Tanya", "O", 18));

        List<User> list = users.stream()
                        .sorted(Comparator.comparing(User::getAge))
                                .collect(Collectors.toMap(User::getName, u->u,(oldName, newName)->oldName))
                                        .values()
                                                .stream()
                .sorted(Comparator.comparing(User::getAge)).toList();


//        users.sort(Comparator.comparingInt(User::getAge));
//        List<User> list = users.stream().collect(Collectors.toMap(User::getName,u->u,(oldName, newName)-> oldName))
//                .values().stream().sorted(Comparator.comparing(User::getAge)).toList();


        /*Map<String, User> collect = users.stream().collect(Collectors.toMap(User::getName, Function.identity(),
                (old, newN) -> old));

        System.out.println(collect);*/

    }

}

class User {
    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User users = (User) o;
        return age == users.age && Objects.equals(name, users.name) && Objects.equals(lastName, users.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}